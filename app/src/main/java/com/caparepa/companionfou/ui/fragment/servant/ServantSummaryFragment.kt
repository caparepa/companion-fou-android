package com.caparepa.companionfou.ui.fragment.servant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.caparepa.companionfou.R
import com.caparepa.companionfou.data.db.entity.nice.ServantEntity
import com.caparepa.companionfou.ui.dialog.LoadingDialog
import com.caparepa.companionfou.ui.viewmodel.nice.ServantViewModel
import com.caparepa.companionfou.utils.loadImage
import com.caparepa.companionfou.utils.toastLong
import kotlinx.android.synthetic.main.fragment_servant_summary.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import org.koin.core.KoinComponent

class ServantSummaryFragment : Fragment(), KoinComponent {
    // TODO: Rename and change types of parameters
    private var servantId: Long? = null
    private var server: String? = null

    val args: ServantSummaryFragmentArgs by navArgs()

    private lateinit var loadingDialog: LoadingDialog

    private val servantViewModel: ServantViewModel by sharedViewModel()
    private lateinit var servant: ServantEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_servant_summary, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        servantId = args.servantId
        server = args.regionServer
        observe()
        loadServantData()
    }

    private fun loadServantData() {
        servantViewModel.fetchServantById(servantId!!, server!!)
    }

    private fun observe() {
        servantViewModel.run {
            servantItemResult.observe(viewLifecycleOwner, Observer {
                it?.let {
                    requireActivity().toastLong("SERVANT SUMMARY ${it.name}")
                    loadServantGraphs(it)
                }
            })
        }
    }

    private fun loadServantGraphs(servant: ServantEntity?) {
        servant?.let {
            val extraAssets = it.getExtraAssetsObj()
            val ascension = extraAssets?.charaGraph?.ascension
            val unknownServantDrawable =
                ContextCompat.getDrawable(requireContext(), R.drawable.listframe_bg_blank)
            ivServantGraphic.loadImage(requireActivity(), ascension?.get(1)!!, unknownServantDrawable!!)
        }
    }
}