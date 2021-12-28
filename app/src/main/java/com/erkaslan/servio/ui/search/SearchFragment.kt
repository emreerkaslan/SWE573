package com.erkaslan.servio.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.erkaslan.servio.R
import com.erkaslan.servio.databinding.FragmentHomeBinding
import com.erkaslan.servio.databinding.FragmentSearchBinding
import com.erkaslan.servio.ui.home.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : Fragment() {
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!
    private lateinit var searchViewModel: SearchViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        searchViewModel = ViewModelProvider(this).get(SearchViewModel::class.java)
        initViews()
        initObservers()
    }

    fun initViews(){
        //searchViewModel.getAllServices()
    }

    fun initObservers(){

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}