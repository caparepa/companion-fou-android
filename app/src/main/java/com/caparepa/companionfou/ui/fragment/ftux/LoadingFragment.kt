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
    private var downloadPool: ArrayList<String> = arrayListOf()
    private var okPool: ArrayList<Int> = arrayListOf()
    private var downloadGeneralCount = 0 //19 in totl
    private var downloadGameCount = 0 //10 in total

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
            finishAndClose.observe(viewLifecycleOwner, Observer {

            })
            finishAndNavigate.observe(viewLifecycleOwner, Observer {

            })
            gameDataDownloadCount.observe(viewLifecycleOwner, Observer {
                it?.let {
                    if(it == downloadGeneralCount) {
                        okPool.add(it)
                        downloadPool.postValue(okPool)
                    }
                }
            })
            generalDataDownloadCount.observe(viewLifecycleOwner, Observer {
                it?.let {
                    it?.let {
                        if(it == downloadGameCount) {
                            okPool.add(it)
                            downloadPool.postValue(okPool)
                        }
                    }
                }
            })
            downloadPool.observe(viewLifecycleOwner, Observer{
                it?.let{
                    if(it.size == 2) {
                        requireActivity().toastLong("OK! NAVIGATE!")
                    } else {
                        requireActivity().toastLong("ERROR! FACK!")
                    }
                }
            })
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
            currentDateResult.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadGeneralData(REGION_NA)
                    downloadGameData(REGION_NA)
                    downloadGeneralData(REGION_JP)
                    downloadGameData(REGION_JP)
                }
            })
            apiInfoResult.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadPool.add("apiInfoResult")
                    downloadGeneralCount++
                }
            })
            attributeRelationResult.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadPool.add("attributeRelationResult")
                    downloadGeneralCount++
                }
            })
            classAttackRateResult.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadPool.add("classAttackRateResult")
                    downloadGeneralCount++
                }
            })
            classRelationResult.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadPool.add("classRelationResult")
                    downloadGeneralCount++
                }
            })
            faceCardResult.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadPool.add("faceCardResult")
                    downloadGeneralCount++
                }
            })
            constantsResult.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadPool.add("constantsResult")
                    downloadGeneralCount++
                }
            })
            buffActionListResult.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadPool.add("buffActionListResult")
                    downloadGeneralCount++
                }
            })
            userLevelResult.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadPool.add("userLevelResult")
                    downloadGeneralCount++
                }
            })
            allEnumsResult.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadPool.add("allEnumsResult")
                    downloadGeneralCount++
                }
            })
            traitMappingResult.observe(viewLifecycleOwner, Observer {
                downloadPool.add("traitMappingResult")
                downloadGeneralCount++
            })
        }
        commandCodeViewModel.run {
            commandCodeListResponse.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadPool.add("commandCodeListResponse")
                    downloadGameCount++
                }
            })
        }
        craftEssenceViewModel.run {
            craftEssenceResponse.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadPool.add("craftEssenceResponse")
                    downloadGameCount++
                }
            })
        }
        materialViewModel.run {
            materialListResponse.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadPool.add("materialListResponse")
                    downloadGameCount++
                }
            })
        }
        mysticCodeViewModel.run {
            mysticCodeListResponse.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadPool.add("mysticCodeListResponse")
                    downloadGameCount++
                }
            })
        }
        servantViewModel.run {
            servantListResponse.observe(viewLifecycleOwner, Observer {
                it?.let {
                    downloadPool.add("servantListResponse")
                    downloadGameCount++
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