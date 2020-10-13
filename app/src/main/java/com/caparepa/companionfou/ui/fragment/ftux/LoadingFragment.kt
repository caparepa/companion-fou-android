package com.caparepa.companionfou.ui.fragment.ftux

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.caparepa.companionfou.R
import com.caparepa.companionfou.ui.dialog.LoadingDialog
import com.caparepa.companionfou.ui.viewmodel.download.DownloadViewModel
import com.caparepa.companionfou.ui.viewmodel.general.GeneralDataViewModel
import com.caparepa.companionfou.ui.viewmodel.nice.*
import com.caparepa.companionfou.utils.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import org.koin.core.KoinComponent

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [LoadingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoadingFragment : Fragment(), KoinComponent {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private val downloadViewModel: DownloadViewModel by sharedViewModel()
    private val generalViewModel: GeneralDataViewModel by sharedViewModel()
    private val commandCodeViewModel: CommandCodeViewModel by sharedViewModel()
    private val craftEssenceViewModel: CraftEssenceViewModel by sharedViewModel()
    private val materialViewModel: MaterialViewModel by sharedViewModel()
    private val mysticCodeViewModel: MysticCodeViewModel by sharedViewModel()
    private val servantViewModel: ServantViewModel by sharedViewModel()

    private lateinit var loadingDialog: LoadingDialog
    private var downloadOkPool: ArrayList<String> = arrayListOf() //there should be 20 elements here at the end
    private var downloadErrorPool: ArrayList<String> = arrayListOf() //there should be 10 elements here at the end


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_loading, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadingDialog = LoadingDialog(requireContext())
        generalViewModel.getLatestApiInfo()
        observeDownloadViewModel()
        observeViewModels()
    }

    private fun observeDownloadViewModel() {
        downloadViewModel.run {
            dataDownloadOkPool.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                it?.let {
                    if(it.size >= 29)
                        requireActivity().toastLong("ALL OK!!!")
                    else
                        requireActivity().toastLong("NOT ALL OK!!!")
                }
            })
            dataDownloadErrorPool.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                it?.let {
                    if(it.size > 0)
                        requireActivity().toastLong("ERROR!!!")
                }
            })
            /*downloadPool.observe(viewLifecycleOwner, Observer{
                it?.let{
                    if(it.size == 2) {
                        requireActivity().toastLong("OK! NAVIGATE!")
                        with(findNavController()) {
                            navigate(LoadingFragmentDirections.actionLoadingFragmentToBottomNav())
                        }
                    } else {
                        requireActivity().toastLong("ERROR! FACK!")
                    }
                }
            })*/
        }
    }

    private fun downloadGeneralData(server: String) {
        generalViewModel.getApiInfo()
        generalViewModel.getAttributeRelation(server)
        generalViewModel.getBuffActionList(server)
        generalViewModel.getClassAttackRate(server)
        generalViewModel.getClassRelation(server)
        generalViewModel.getConstants(server)
        generalViewModel.getFaceCard(server)
        generalViewModel.getGameEnums(server)
        generalViewModel.getTraitMapping(server)
        generalViewModel.getUserLevel(server)
    }

    private fun downloadGameData(server: String) {
        commandCodeViewModel.getCommandCodes(server)
        craftEssenceViewModel.getCraftEssences(server)
        materialViewModel.getMaterials(server)
        mysticCodeViewModel.getMysticCodes(server)
        servantViewModel.getServants(server)
    }

    private fun observeViewModels() {
        generalViewModel.run {
            loadingState.observe(viewLifecycleOwner, Observer {
                if (it) {
                    loadingDialog.setCanceledOnTouchOutside(false)
                    loadingDialog.show()
                } else {
                    loadingDialog.dismiss()
                }
            })
            currentDateResult.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                it?.let {
                    downloadGeneralData(REGION_NA)
                    downloadGameData(REGION_NA)
                    downloadGeneralData(REGION_JP)
                    downloadGameData(REGION_JP)
                }
            })
            onGetSuccess.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                it?.let {
                    downloadOkPool.add(it)
                    downloadViewModel.dataDownloadOkPool.postValue(downloadOkPool)
                }
            })
            onGetError.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                it?.let {
                    downloadErrorPool.add(it)
                    downloadViewModel.dataDownloadErrorPool.postValue(downloadErrorPool)
                }
            })
        }
        commandCodeViewModel.run {
            onGetSuccess.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadOkPool.add(it)
                    downloadViewModel.dataDownloadOkPool.postValue(downloadOkPool)
                }
            })
            onGetError.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadErrorPool.add(it)
                    downloadViewModel.dataDownloadErrorPool.postValue(downloadErrorPool)
                }
            })
        }
        craftEssenceViewModel.run {
            onGetSuccess.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                it?.let {
                    downloadOkPool.add(it)
                    downloadViewModel.dataDownloadOkPool.postValue(downloadOkPool)
                }
            })
            onGetError.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                it?.let {
                    downloadErrorPool.add(it)
                    downloadViewModel.dataDownloadErrorPool.postValue(downloadErrorPool)
                }
            })
        }
        materialViewModel.run {
            onGetSuccess.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                it?.let {
                    downloadOkPool.add(it)
                    downloadViewModel.dataDownloadOkPool.postValue(downloadOkPool)
                }
            })
            onGetError.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                it?.let {
                    downloadErrorPool.add(it)
                    downloadViewModel.dataDownloadErrorPool.postValue(downloadErrorPool)
                }
            })
        }
        mysticCodeViewModel.run {
            onGetSuccess.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                it?.let {
                    downloadOkPool.add(it)
                    downloadViewModel.dataDownloadOkPool.postValue(downloadOkPool)
                }
            })
            onGetError.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                it?.let {
                    downloadErrorPool.add(it)
                    downloadViewModel.dataDownloadErrorPool.postValue(downloadErrorPool)
                }
            })
        }
        servantViewModel.run {
            onGetSuccess.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                it?.let {
                    downloadOkPool.add(it)
                    downloadViewModel.dataDownloadOkPool.postValue(downloadOkPool)
                }
            })
            onGetError.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                it?.let {
                    downloadErrorPool.add(it)
                    downloadViewModel.dataDownloadErrorPool.postValue(downloadErrorPool)
                }
            })
        }
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment LoadingFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            LoadingFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}