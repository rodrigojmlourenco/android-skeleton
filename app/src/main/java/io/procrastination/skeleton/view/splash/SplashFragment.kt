package io.procrastination.skeleton.view.splash

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import io.procrastination.skeleton.R
import io.procrastination.skeleton.model.viewmodels.ViewModelFactory
import javax.inject.Inject

@AndroidEntryPoint
class SplashFragment : Fragment() {

    @Inject
    lateinit var factory: ViewModelFactory

    private val vm: SplashViewModel by viewModels { factory }

    override fun onAttach(context: Context) {
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vm.event.observe(viewLifecycleOwner) { event ->
            event?.let {
                when (event) {
                    is SplashViewModel.Event.Error -> handleError(event)
                    is SplashViewModel.Event.Proceed -> handleProceed()
                }

                vm.consumeEvent()
            }
        }
    }

    private fun handleProceed() {
        findNavController().navigate(SplashFragmentDirections.actionSplashToHome())
    }

    private fun handleError(event: SplashViewModel.Event.Error) {

//        val snackbar = createSnackbar(event.message)
//
//        if (event.isCritical) {
//            snackbar.setAction(R.string.close) { requireActivity().finish() }
//        }
//
//        snackbar.show()
    }
}