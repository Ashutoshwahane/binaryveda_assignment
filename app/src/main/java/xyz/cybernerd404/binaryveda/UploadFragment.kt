package xyz.cybernerd404.binaryveda

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import xyz.cybernerd404.binaryveda.adapter.PhotoAdapter
import xyz.cybernerd404.binaryveda.databinding.FragmentUploadBinding
import xyz.cybernerd404.binaryveda.model.Image


class UploadFragment : Fragment() {

    private lateinit var binding: FragmentUploadBinding
    private lateinit var adapter: PhotoAdapter
    private lateinit var list: MutableList<Image>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentUploadBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list = arrayListOf()
        adapter = PhotoAdapter()
        binding.apply {
            photoRV.layoutManager = GridLayoutManager(requireContext(), 2)
            photoRV.adapter = adapter
        }

        list.add(Image(R.drawable.night))
        list.add(Image(R.drawable.demo))
        list.add(Image(R.drawable.night))
        list.add(Image(R.drawable.demo))
        list.add(Image(R.drawable.night))
        list.add(Image(R.drawable.demo))
        list.add(Image(R.drawable.night))
        list.add(Image(R.drawable.demo))

        adapter.setList(list)


    }


}