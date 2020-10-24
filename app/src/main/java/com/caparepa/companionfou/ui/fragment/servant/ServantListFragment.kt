package com.caparepa.companionfou.ui.fragment.servant

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.caparepa.companionfou.R
import com.caparepa.companionfou.data.db.entity.nice.ServantEntity
import com.caparepa.companionfou.ui.adapter.ServantGridAdapter
import com.caparepa.companionfou.ui.dialog.LoadingDialog
import com.caparepa.companionfou.ui.viewmodel.nice.ServantViewModel
import com.caparepa.companionfou.utils.REGION_JP
import com.caparepa.companionfou.utils.REGION_NA
import com.caparepa.companionfou.utils.delegates.PreferenceDelegate.Companion.currentServer
import com.caparepa.companionfou.utils.setOneOffClickListener
import com.caparepa.companionfou.utils.toastLong
import kotlinx.android.synthetic.main.fragment_servant_list.*
import org.koin.core.KoinComponent
import org.koin.core.inject

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ServantListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ServantListFragment : Fragment(), KoinComponent {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    //dialogs
    private lateinit var loadingDialog: LoadingDialog

    //ViewModel
    private val servantViewModel: ServantViewModel by inject()

    //adapter
    private var servantAdapter: ServantGridAdapter? = null

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
        return inflater.inflate(R.layout.fragment_servant_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loadingDialog = LoadingDialog(requireContext())
        observeViewModel()
        setUpListeners()
    }

    private fun setUpListeners() {
        btnServantsNa.setOneOffClickListener {
            servantViewModel.fetchServants(REGION_NA)
        }
        btnServantsJp.setOnClickListener {
            servantViewModel.fetchServants(REGION_JP)
        }
    }

    private fun observeViewModel() = servantViewModel.run {
        loadingState.observe(viewLifecycleOwner, Observer {
            if (it) {
                loadingDialog.setCanceledOnTouchOutside(false)
                loadingDialog.show()
            } else {
                loadingDialog.dismiss()
            }
        })
        servantListResult.observe(viewLifecycleOwner, Observer {
            it?.let {
                loadingDialog.dismiss()
                setServantGridAdapter(it)
            }
        })
    }

    private fun setServantGridAdapter(servantList: List<ServantEntity>?) {
        servantList?.let {
            servantAdapter = ServantGridAdapter(requireActivity(), servantList, onItemClick)
            rvServantList.adapter = servantAdapter
            rvServantList.layoutManager = GridLayoutManager(requireActivity(), 4)
        }
    }

    private var onItemClick: (ServantEntity) -> Unit = { servant ->
        requireActivity().toastLong("Servant clicked! -> ${servant.name}")
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ServantListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ServantListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}