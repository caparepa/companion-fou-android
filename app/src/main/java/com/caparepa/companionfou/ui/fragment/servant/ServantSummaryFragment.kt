package com.caparepa.companionfou.ui.fragment.servant

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.caparepa.companionfou.R
import com.caparepa.companionfou.data.db.entity.nice.ServantEntity
import com.caparepa.companionfou.ui.dialog.LoadingDialog
import com.caparepa.companionfou.ui.viewmodel.nice.ServantViewModel
import com.caparepa.companionfou.utils.SERVANT_ID
import com.caparepa.companionfou.utils.REGION_SERVER
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import org.koin.core.KoinComponent
import org.koin.core.inject

class ServantSummaryFragment : Fragment(), KoinComponent {
    // TODO: Rename and change types of parameters
    private var servantId: Long? = null
    private var server: String? = null

    private lateinit var loadingDialog: LoadingDialog

    private val servantViewModel: ServantViewModel by sharedViewModel()
    private lateinit var servant: ServantEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            servantId = it.getLong(SERVANT_ID)
            server = it.getString(REGION_SERVER)
        }
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
        observe()
        loadServantData()
    }

    private fun loadServantData() {
        servantViewModel.fetchServantById(servantId!!, server!!)
    }

    private fun observe() {
        servantViewModel.run {
            servantItemResult.observe(viewLifecycleOwner, Observer {

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
         * @return A new instance of fragment UnitDetailFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: Long, param2: String) =
            ServantSummaryFragment().apply {
                arguments = Bundle().apply {
                    putLong(SERVANT_ID, param1)
                    putString(REGION_SERVER, param2)
                }
            }
    }
}