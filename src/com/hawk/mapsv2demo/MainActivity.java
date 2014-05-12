package com.hawk.mapsv2demo;

import android.annotation.SuppressLint;//**
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;//**
import com.google.android.gms.maps.MapFragment;//**
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;




public class MainActivity extends ActionBarActivity {

//	static final LatLng UCSD = new LatLng(32.879271, -117.237017);//(32.52389694, -117.1469954);
//	static final LatLng Warren = new LatLng(32.880966, -117.234450);
	static final LatLng UCSD = new LatLng(32.879271, -117.2289000);//(32.52389694, -117.1469954);
	static final LatLng Warren = new LatLng(32.880966, -117.234450);
	static final LatLng Center = new LatLng(32.878053, -117.237218);
	static final LatLng socialScience = new LatLng(32.883822, -117.240748);
	static final LatLng SOM = new LatLng(32.875852, -117.237578);
	static final LatLng RevellePlaza = new LatLng(32.874851, -117.241217);
	GoogleMap map;//**
	 @SuppressLint("NewApi")//**
	 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
//	Marker ucsd = map.addMarker(new MarkerOptions().position(UCSD)
//	          .title("UCSD"));
	Marker warrenHallMarker = map.addMarker(new MarkerOptions().position(Warren)
	          .title("Warren"));
	Marker centerHallMarker = map.addMarker(new MarkerOptions().position(Center)
	          .title("Center"));
	Marker socialScienceMarker = map.addMarker(new MarkerOptions().position(socialScience)
	          .title("Social Sceinces"));
	Marker SOMMarker = map.addMarker(new MarkerOptions().position(SOM)
	          .title("SOM"));
	Marker revellePlazaMarker = map.addMarker(new MarkerOptions().position(RevellePlaza)
	          .title("Revelle Plaza"));
	map.moveCamera(CameraUpdateFactory.newLatLngZoom(UCSD, 15));
//		   map.setMapType(GoogleMap.MAP_TYPE_HYBRID);
		  // map.setMapType(GoogleMap.MAP_TYPE_NONE);
//	map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//		   map.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
		  // map.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
		 
		
		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
