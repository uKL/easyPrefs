package com.mcs.easyprefssample;

import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

import static com.mcs.easyprefs.EasyPrefsMod.DefaultPrefs;
import static com.mcs.easyprefs.EasyPrefsMod.getDefaultStringSet;
import static com.mcs.easyprefs.EasyPrefsMod.putDefaultStringSet;

public class MainActivityFragment extends Fragment {

    private Unbinder unbinder;
    private List<Message> messageList = new ArrayList<>();
    private MessageAdapter adapter;
    @BindView(R.id.messages_list)
    RecyclerView myList;
    @BindView(R.id.editText) EditText editText;

    SharedPreferences pref;
    SharedPreferences.OnSharedPreferenceChangeListener listener = new SharedPreferences.OnSharedPreferenceChangeListener() {
        @Override
        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
            Toast.makeText(getActivity(), "key: " + key, Toast.LENGTH_LONG).show();
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        unbinder = ButterKnife.bind(this, view);
        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        pref = DefaultPrefs(getActivity());

        adapter = new MessageAdapter(getActivity(), messageList);
        myList.setLayoutManager(new LinearLayoutManager(getActivity()));
        myList.setItemAnimator(new DefaultItemAnimator());
        myList.setAdapter(adapter);
        TheList();
    }

    public void TheList() {
        Message txi = new Message(editText());
        messageList.add(txi);
        adapter.notifyDataSetChanged();
    }

    public String editText() {
        return editText.getText().toString();
    }

    public void savedList() {

        Set<String> set = new HashSet<>();
        for (int i = 0; i < messageList.size(); i++) {
            //messageList.get(i);
            set.add(messageList.get(i).getTitle());
            putDefaultStringSet(getActivity(), "saved", set);
        }
    }

    public void getList() {
        messageList.clear();
        String[] the = loadList().toArray(new String[loadList().size()]);
        for (String temp : the) {
            Message txi = new Message(temp);
            messageList.add(txi);
        }
        adapter.notifyDataSetChanged();
    }

    public Set<String> loadList() {
        return getDefaultStringSet(getActivity(), "saved", null);
    }

    @Override
    public void onCreateOptionsMenu(Menu search, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_main, search);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_add) {
            TheList();
            return true;
        }

        if (id == R.id.action_save) {
            savedList();
            return true;
        }

        if (id == R.id.action_load) {
            getList();
            return true;
        }

        if (id == R.id.action_clear) {
            messageList.clear();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPause() {
        super.onPause();

        pref.unregisterOnSharedPreferenceChangeListener(listener);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void onResume() {
        super.onResume();
        pref.registerOnSharedPreferenceChangeListener(listener);
    }

}