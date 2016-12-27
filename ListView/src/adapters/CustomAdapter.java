package adapters;

import com.example.listview.R;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{

	private String[] array;
	private Activity activity;
	private LayoutInflater inflater;
	
	public CustomAdapter(String[] array,Activity mactivity) {
		this.array = array;
		this.activity = mactivity;
		this.inflater = LayoutInflater.from(mactivity);
		
	}
	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return array.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.custom_list_row, null);
		
		TextView txtView = (TextView) view.findViewById(R.id.mytextview);
		txtView.setText(array[position]);
		
		return view;
	}

}
