package com.cherrypicks.lib.ui.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.cherrypicks.lib.database.DatabaseManager;
import com.cherrypicks.lib.utils.Logger;

/**
 * BaseFragment, all the fragment in this app should extends it.
 * 
 * @since 1.0.0
 * @author Jerry Zhang<jerryzhang@cherrypicks.com>
 */
public abstract class BaseFragment extends Fragment {

	protected Logger logger;

	protected View main;

	protected FragmentTransaction ft;

	protected DatabaseManager dbManager;

	/**
	 * Initialize values, it should be called before inflating layout.
	 */
	public abstract void initValues();

	/**
	 * Bind the widget of the layout file to the variable inside the fragment.
	 */
	public abstract void findViews();

	/**
	 * Add event to the widget.
	 */
	public abstract void bindEvents();

	protected void getFragmentTransaction() {
		ft = getActivity().getSupportFragmentManager().beginTransaction();
	}

}
