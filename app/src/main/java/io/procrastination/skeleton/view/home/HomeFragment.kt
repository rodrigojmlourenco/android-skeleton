package io.procrastination.skeleton.view.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import io.procrastination.skeleton.R

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var btnShowCaseMaterialDesign: Button

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false).also { view ->
            btnShowCaseMaterialDesign = view.findViewById(R.id.btn_material_design)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnShowCaseMaterialDesign.setOnClickListener {
//            startActivity(MaterialSampleActivity.getLaunchIntent(requireContext()))
        }
    }
}