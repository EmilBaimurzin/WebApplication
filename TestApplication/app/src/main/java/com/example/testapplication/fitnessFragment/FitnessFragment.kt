package com.example.testapplication.fitnessFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testapplication.databinding.FragmentFitnessBinding
import com.example.testapplication.fitnessFragment.recyclerView.FitnessAdapter
import com.google.android.material.tabs.TabLayout

class FitnessFragment : Fragment() {
    private lateinit var fitnessAdapter: FitnessAdapter
    private lateinit var binding: FragmentFitnessBinding
    private val viewModel: FitnessViewModel by viewModels()
    private lateinit var listener: TabLayout.OnTabSelectedListener

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFitnessBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList()
        listener = onTabSelectedListener()
        binding.tabLayout.setOnTabSelectedListener(listener)
        binding.tabLayout.getTabAt(viewModel.getTabState())!!.select()
        changeItems(viewModel.getTabState())

    }

    private fun initList() {
        fitnessAdapter = FitnessAdapter()
        with(binding.recyclerview) {
            adapter = fitnessAdapter
            layoutManager = LinearLayoutManager(requireContext()).apply {
                orientation = LinearLayoutManager.VERTICAL
            }
            setHasFixedSize(true)
        }
    }

    private fun onTabSelectedListener(): TabLayout.OnTabSelectedListener {
        return object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                changeItems(tab?.position!!)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}
            override fun onTabReselected(tab: TabLayout.Tab?) {}
        }
    }

    private fun changeItems(tabPosition: Int) {
        when (tabPosition) {
            0 -> {
                fitnessAdapter.items = viewModel.getMondayMeals()
                fitnessAdapter.notifyDataSetChanged()
                viewModel.setTabState(0)
            }
            1 -> {
                fitnessAdapter.items = viewModel.getTuesdayMeals()
                fitnessAdapter.notifyDataSetChanged()
                viewModel.setTabState(1)
            }
            2 -> {
                fitnessAdapter.items = viewModel.getWednesdayMeals()
                fitnessAdapter.notifyDataSetChanged()
                viewModel.setTabState(2)
            }
            3 -> {
                fitnessAdapter.items = viewModel.getThursdayMeals()
                fitnessAdapter.notifyDataSetChanged()
                viewModel.setTabState(3)
            }
            4 -> {
                fitnessAdapter.items = viewModel.getFridayMeals()
                fitnessAdapter.notifyDataSetChanged()
                viewModel.setTabState(4)
            }
            5 -> {
                fitnessAdapter.items = viewModel.getWeekendsMeals()
                fitnessAdapter.notifyDataSetChanged()
                viewModel.setTabState(5)
            }
            6 -> {
                fitnessAdapter.items = viewModel.getWeekendsMeals()
                fitnessAdapter.notifyDataSetChanged()
                viewModel.setTabState(6)
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putByte("State", 0)
    }

    override fun onDestroy() {
        super.onDestroy()
        fitnessAdapter.items = mutableListOf()
        binding.tabLayout.removeOnTabSelectedListener(listener)
    }
}