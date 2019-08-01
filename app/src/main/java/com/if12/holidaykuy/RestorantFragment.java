package com.if12.holidaykuy;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.if12.holidaykuy.adapter.RestorantRecyclerAdapter;
import com.if12.holidaykuy.model.RestorantModel;
import com.if12.holidaykuy.presenter.RestorantPresenter;
import com.if12.holidaykuy.presenter.RestorantPresenterImpl;
import com.if12.holidaykuy.view.RestorantView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link RestorantFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link RestorantFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RestorantFragment extends Fragment implements RestorantView {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    //Activity
    private RecyclerView recyclerViewRestorant;
    private RestorantRecyclerAdapter adapterRestorant;
    private List<RestorantModel> restorantModels = new ArrayList<>();
    private RestorantPresenter presenterRestorant;

    private OnFragmentInteractionListener mListener;

    public RestorantFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RestorantFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RestorantFragment newInstance(String param1, String param2) {
        RestorantFragment fragment = new RestorantFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_restorant, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        //activity
        presenterRestorant = new RestorantPresenterImpl(getContext(), this);

        recyclerViewRestorant = getView().findViewById(R.id.recycler_restorant);
        recyclerViewRestorant.setLayoutManager(new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL));

        adapterRestorant = new RestorantRecyclerAdapter(getContext(), restorantModels);
        recyclerViewRestorant.setAdapter(adapterRestorant);



        //load activity
        presenterRestorant.loadRestorant();

    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onLoadRestorant(List<RestorantModel> restorant) {
        restorantModels.addAll(restorant);
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
