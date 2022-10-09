package mikepopup.com.shoppingappui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mikepopup.com.shoppingappui.adapter.ItemAdapter
import mikepopup.com.shoppingappui.data.Datasource
import mikepopup.com.shoppingappui.databinding.FragmentWomenCategoryBinding


class WomenCategoryFragment : Fragment() {

    private lateinit var binding: FragmentWomenCategoryBinding
    val myDataset = Datasource().loadCategoryWomen()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentBinding = FragmentWomenCategoryBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rvWomanCategory.adapter = ItemAdapter(requireContext(), myDataset)

        binding.rvWomanCategory.setHasFixedSize(true)

    }


}