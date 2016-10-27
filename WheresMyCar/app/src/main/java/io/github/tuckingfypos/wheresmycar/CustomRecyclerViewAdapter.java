package io.github.tuckingfypos.wheresmycar;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by TuckingFypos on 9/28/16.
 */

public class CustomRecyclerViewAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    List<BluetoothDeviceObj> mBluetoothDeviceObjs;
    Context context;

    public CustomRecyclerViewAdapter(final List<BluetoothDeviceObj> BluetoothDevicesList){
        mBluetoothDeviceObjs = BluetoothDevicesList;
    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout1, parent, false);
        CustomViewHolder viewHolder = new CustomViewHolder(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {

        BluetoothDeviceObj bluetoothDevice = mBluetoothDeviceObjs.get(position);
        final String name = bluetoothDevice.getmText1();
        final String Id = bluetoothDevice.getmText2();
        final Double latitude = bluetoothDevice.getmText3();
        final Double longitude = bluetoothDevice.getmText4();

        holder.setmTextView1(name);
        holder.setmTextView2(Id);
        holder.setmTextView3(latitude);
        holder.setmTextView4(longitude);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                context = view.getContext();

                Uri mapUri = Uri.parse("geo:0,0?q="+String.valueOf(latitude)+","+String.valueOf(longitude));
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                context.startActivity(mapIntent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mBluetoothDeviceObjs.size();
    }
}
