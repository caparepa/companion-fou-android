package com.caparepa.companionfou.ui.fragment.ftux

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.caparepa.companionfou.R
import com.caparepa.companionfou.ui.dialog.LoadingDialog
import com.caparepa.companionfou.ui.viewmodel.download.DownloadViewModel
import com.caparepa.companionfou.ui.viewmodel.general.GeneralDataViewModel
import com.caparepa.companionfou.ui.viewmodel.nice.*
import com.caparepa.companionfou.utils.*
import kotlinx.android.synthetic.main.fragment_loading.*
import kotlinx.coroutines.delay
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
    private var downloadOkPool: ArrayList<String> =
        arrayListOf() //there should be 20 elements here at the end
    private var downloadErrorPool: ArrayList<String> =
        arrayListOf() //there should be 10 elements here at the end
    private var selectedRegion: String = REGION_NA

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
        btnDownloadNA.isClickable = false
        btnDownloadJP.isClickable = false
        setUpListeners()
        observeDownloadViewModel()
        observeViewModels()
    }

    private fun observeDownloadViewModel() {
        downloadViewModel.run {

        }
    }

    private fun setUpListeners() {
        btnDownloadNA.setOneOffClickListener {
            selectedRegion = REGION_NA
            activity?.toastLong("DOWNLOADING NA DATA!")
            generalViewModel.getAttributeRelation(selectedRegion)
        }
        btnDownloadJP.setOneOffClickListener {
            selectedRegion = REGION_JP
            activity?.toastLong("DOWNLOADING JP DATA!")
            generalViewModel.getAttributeRelation(selectedRegion)
        }
        btnContinue.setOneOffClickListener {
            findNavController().apply {
                navigate(LoadingFragmentDirections.actionLoadingFragmentToBottomNav())
            }
        }
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
                    generalViewModel.getApiInfo()
                }
            })
            onError.observe(viewLifecycleOwner, Observer {
                it?.let {
                    requireActivity().toastLong(it)
                }
            })
            apiInfoResponseOk.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                if (it) {
                    tv_apiInfoResponseOk.text = "apiInfoResponseOk $it $selectedRegion"
                } else {
                    tv_apiInfoResponseOk.text = "apiInfoResponseOk $it NOK $selectedRegion"
                }
                when (selectedRegion) {
                    REGION_NA -> {
                        btnDownloadNA.isClickable = true
                    }
                    REGION_JP -> {
                        btnDownloadJP.isClickable = true
                    }
                }
            })
            attributeRelationResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_attributeRelationResponseOk.text = "attributeRelationResponseOk $it $selectedRegion"
                } else {
                    tv_attributeRelationResponseOk.text = "attributeRelationResponseOk $it NOK $selectedRegion"
                }
                generalViewModel.getBuffActionList(selectedRegion)
            })
            buffActionListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_buffActionListResponseOk.text = "buffActionListResponseOk $it $selectedRegion"
                } else {
                    tv_buffActionListResponseOk.text = "buffActionListResponseOk $it NOK $selectedRegion"
                }
                generalViewModel.getClassAttackRate(selectedRegion)
            })
            classAttackRateResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_classAttackRateResponseOk.text = "classAttackRateResponseOk $it $selectedRegion"
                } else {
                    tv_classAttackRateResponseOk.text = "classAttackRateResponseOk $it NOK $selectedRegion"
                }
                generalViewModel.getClassRelation(selectedRegion)
            })
            classRelationResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_classRelationResponseOk.text = "classRelationResponseOk $it $selectedRegion"
                } else {
                    tv_classRelationResponseOk.text = "classRelationResponseOk $it NOK $selectedRegion"
                }
                generalViewModel.getConstants(selectedRegion)
            })
            constantsResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_constantsResponseOk.text = "constantsResponseOk $it $selectedRegion"
                } else {
                    tv_constantsResponseOk.text = "constantsResponseOk $it NOK $selectedRegion"
                }
                generalViewModel.getFaceCard(selectedRegion)
            })
            faceCardResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_faceCardResponseOk.text = "faceCardResponseOk $it $selectedRegion"
                } else {
                    tv_faceCardResponseOk.text = "faceCardResponseOk $it NOK $selectedRegion"
                }
                generalViewModel.getGameEnums(selectedRegion)
            })
            allEnumsResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_allEnumsResponseOk.text = "allEnumsResponseOk $it $selectedRegion"
                } else {
                    tv_allEnumsResponseOk.text = "allEnumsResponseOk $it NOK $selectedRegion"
                }
                generalViewModel.getTraitMapping(selectedRegion)
            })
            traitMappingResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_traitMappingResponseOk.text = "traitMappingResponseOk $it $selectedRegion"
                } else {
                    tv_traitMappingResponseOk.text = "traitMappingResponseOk $it NOK $selectedRegion"
                }
                generalViewModel.getUserLevel(selectedRegion)
            })
            userLevelResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_userLevelResponseOk.text = "userLevelResponseOk $it $selectedRegion"
                } else {
                    tv_userLevelResponseOk.text = "userLevelResponseOk $it NOK $selectedRegion"
                }
                commandCodeViewModel.getCommandCodes(selectedRegion)
            })
        }
        commandCodeViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            commandCodeListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_commandCodeListResponseOk.text = "commandCodeListResponseOk $it $selectedRegion"
                } else {
                    tv_commandCodeListResponseOk.text = "commandCodeListResponseOk $it NOK $selectedRegion"
                }
                craftEssenceViewModel.getCraftEssences(selectedRegion)
            })
        }
        craftEssenceViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            craftEssenceListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_craftEssenceListResponseOk.text = "craftEssenceListResponseOk $it $selectedRegion"
                } else {
                    tv_craftEssenceListResponseOk.text = "craftEssenceListResponseOk $it NOK $selectedRegion"
                }
                materialViewModel.getMaterials(selectedRegion)
            })
        }
        materialViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            materialListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_materialListResponseOk.text = "materialListResponseOk $it $selectedRegion"
                } else {
                    tv_materialListResponseOk.text = "materialListResponseOk $it NOK $selectedRegion"
                }
                mysticCodeViewModel.getMysticCodes(selectedRegion)
            })
        }
        mysticCodeViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            mysticCodeListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_mysticCodeListResponseOk.text = "mysticCodeListResponseOk $it $selectedRegion"
                } else {
                    tv_mysticCodeListResponseOk.text = "mysticCodeListResponseOk $it NOK $selectedRegion"
                }
                servantViewModel.getServants(selectedRegion)
            })
        }
        servantViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            servantListResponseOk.observe(viewLifecycleOwner, Observer {
                loadingDialog.dismiss()
                if (it) {
                    tv_servantListResponseOk.text = "servantListResponseOk $it $selectedRegion"
                } else {
                    tv_servantListResponseOk.text = "servantListResponseOk $it NOK $selectedRegion"
                }
                requireActivity().toastLong("YAAAAY! PEACE, PEACE!")
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