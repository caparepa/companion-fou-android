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
                if (it) {
                    tv_apiInfoResponseOk.text = "apiInfoResponseOk $it"
                } else {
                    tv_apiInfoResponseOk.text = "apiInfoResponseOk $it NOK"
                }
                generalViewModel.getAttributeRelation(REGION_NA)
                generalViewModel.getAttributeRelation(REGION_JP)
            })
            attributeRelationResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_attributeRelationResponseOk.text = "attributeRelationResponseOk $it"
                } else {
                    tv_attributeRelationResponseOk.text = "attributeRelationResponseOk $it NOK"
                }
                generalViewModel.getBuffActionList(REGION_NA)
                generalViewModel.getBuffActionList(REGION_JP)
            })
            buffActionListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_buffActionListResponseOk.text = "buffActionListResponseOk $it"
                } else {
                    tv_buffActionListResponseOk.text = "buffActionListResponseOk $it NOK"
                }
                generalViewModel.getClassAttackRate(REGION_NA)
                generalViewModel.getClassAttackRate(REGION_JP)
            })
            classAttackRateResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_classAttackRateResponseOk.text = "classAttackRateResponseOk $it"
                } else {
                    tv_classAttackRateResponseOk.text = "classAttackRateResponseOk $it NOK"
                }
                generalViewModel.getClassRelation(REGION_NA)
                generalViewModel.getClassRelation(REGION_JP)
            })
            classRelationResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_classRelationResponseOk.text = "classRelationResponseOk $it"
                } else {
                    tv_classRelationResponseOk.text = "classRelationResponseOk $it NOK"
                }
                generalViewModel.getConstants(REGION_NA)
                generalViewModel.getConstants(REGION_JP)
            })
            constantsResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_constantsResponseOk.text = "constantsResponseOk $it"
                } else {
                    tv_constantsResponseOk.text = "constantsResponseOk $it NOK"
                }
                generalViewModel.getFaceCard(REGION_NA)
                generalViewModel.getFaceCard(REGION_JP)
            })
            faceCardResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_faceCardResponseOk.text = "faceCardResponseOk $it"
                } else {
                    tv_faceCardResponseOk.text = "faceCardResponseOk $it NOK"
                }
                generalViewModel.getGameEnums(REGION_NA)
                generalViewModel.getGameEnums(REGION_JP)
            })
            allEnumsResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_allEnumsResponseOk.text = "allEnumsResponseOk $it"
                } else {
                    tv_allEnumsResponseOk.text = "allEnumsResponseOk $it NOK"
                }
                generalViewModel.getTraitMapping(REGION_NA)
                generalViewModel.getTraitMapping(REGION_JP)
            })
            traitMappingResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_traitMappingResponseOk.text = "traitMappingResponseOk $it"
                } else {
                    tv_traitMappingResponseOk.text = "traitMappingResponseOk $it NOK"
                }
                generalViewModel.getUserLevel(REGION_NA)
                generalViewModel.getUserLevel(REGION_JP)
            })
            userLevelResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_userLevelResponseOk.text = "userLevelResponseOk $it"
                } else {
                    tv_userLevelResponseOk.text = "userLevelResponseOk $it NOK"
                }
                commandCodeViewModel.getCommandCodes(REGION_NA)
                commandCodeViewModel.getCommandCodes(REGION_JP)
            })
        }
        commandCodeViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            commandCodeListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_commandCodeListResponseOk.text = "commandCodeListResponseOk $it"
                } else {
                    tv_commandCodeListResponseOk.text = "commandCodeListResponseOk $it NOK"
                }
                craftEssenceViewModel.getCraftEssences(REGION_NA)
                craftEssenceViewModel.getCraftEssences(REGION_JP)
            })
        }
        craftEssenceViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            craftEssenceListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_craftEssenceListResponseOk.text = "craftEssenceListResponseOk $it"
                } else {
                    tv_craftEssenceListResponseOk.text = "craftEssenceListResponseOk $it NOK"
                }
                materialViewModel.getMaterials(REGION_NA)
                materialViewModel.getMaterials(REGION_JP)
            })
        }
        materialViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            materialListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_materialListResponseOk.text = "materialListResponseOk $it"
                } else {
                    tv_materialListResponseOk.text = "materialListResponseOk $it NOK"
                }
                mysticCodeViewModel.getMysticCodes(REGION_NA)
                mysticCodeViewModel.getMysticCodes(REGION_JP)
            })
        }
        mysticCodeViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            mysticCodeListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_mysticCodeListResponseOk.text = "mysticCodeListResponseOk $it"
                } else {
                    tv_mysticCodeListResponseOk.text = "mysticCodeListResponseOk $it NOK"
                }
                servantViewModel.getServants(REGION_NA)
                servantViewModel.getServants(REGION_JP)
            })
        }
        servantViewModel.run {
            onError.observe(viewLifecycleOwner, Observer {
                requireActivity().toastLong(it)
            })
            servantListResponseOk.observe(viewLifecycleOwner, Observer {
                if (it) {
                    tv_servantListResponseOk.text = "servantListResponseOk $it"
                } else {
                    tv_servantListResponseOk.text = "servantListResponseOk $it NOK"
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