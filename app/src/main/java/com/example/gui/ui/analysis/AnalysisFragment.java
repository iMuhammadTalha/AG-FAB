package com.example.gui.ui.analysis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.gui.R;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;
import de.codecrafters.tableview.toolkit.SimpleTableHeaderAdapter;

public class AnalysisFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_analysis, container, false);

        TableView tableView = root.findViewById(R.id.analysis_table);
        String[] headers={"Year", "Cost", "Profit"};
        String[][] data={{"2010", "1,204,200", "3,240,360"},
                {"2011", "1,563,200", "4,235,430"},
                {"2012", "2,573,300", "5,230,000"},
                {"2013", "2,888,300", "6,132,220"},
                {"2014", "3,794,500", "5,322,200"},
                {"2015", "3,110,250", "6,034,500"}};

        tableView.setHeaderAdapter(new SimpleTableHeaderAdapter(getActivity(), headers));
        tableView.setDataAdapter(new SimpleTableDataAdapter(getActivity(), data));
        return root;
    }
}
