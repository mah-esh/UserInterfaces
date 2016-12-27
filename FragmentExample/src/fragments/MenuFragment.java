package fragments;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.fragmentexample.R;
public class MenuFragment extends   Fragment {
    String[] AndroidOS = new String[] { "Cupcake","Donut","Eclair","Froyo","Gingerbread","Honeycomb","Ice Cream SandWich","Jelly Bean","KitKat" };
    String[] Version = new String[]{"1.5","1.6","2.0-2.1","2.2","2.3","3.0-3.2","4.0","4.1-4.3","4.4"};
    private  ListView listView;
    @SuppressWarnings("deprecation")

    @Override
    public void onAttach(Activity activity) {
    	// TODO Auto-generated method stub
    	super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
    };
    
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.list_fragment, container, false);
        listView = (ListView) view.findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, AndroidOS);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub
				TextFragment txt = (TextFragment)getFragmentManager().findFragmentById(R.id.fragment2);
		        txt.change(AndroidOS[position],"Version : "+Version[position]);
		        listView.setSelector(android.R.color.holo_blue_dark);
				
			}
		});
 
        return view;
 
    }
    
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
    	super.onActivityCreated(savedInstanceState);
    }
    
    @Override
    public void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    }
    
    @Override
    public void onPause() {
    	// TODO Auto-generated method stub
    	super.onPause();
    }
    
    @Override
    public void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    }
    
    @Override
    public void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    }
        
    @Override
    public void onDestroyView() {
    	// TODO Auto-generated method stub
    	super.onDestroyView();
    }
    
    @Override
    public void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    }
    
    @Override
    public void onDetach() {
    	// TODO Auto-generated method stub
    	super.onDetach();
    }
}