package com.property.manager.Manager;

import com.property.manager.Models.Branch;
import com.property.manager.Models.FileManager;


import java.util.ArrayList;
import java.util.List;

public class BranchManager {

    private List<Branch> branchList;
    private String filename = "branch.dat";
    private FileManager fileManager;

    public BranchManager(){
        fileManager = new FileManager(filename);
        branchList = (List<Branch>)fileManager.ReadFile();
        if(branchList == null)
            branchList = new ArrayList<>();
    }

    public void addBranch(Branch branch){
        branchList.add(branch);
        fileManager.saveFile(branchList);
    }

    public void deleteBranch(String id) {
        int i = -1;
        for (Branch br:branchList)
            if(br.getId().equals(id))
                i = branchList.indexOf(br);
        if(i!=-1)
            branchList.remove(i);
        fileManager.saveFile(branchList);

    }

    public List<Branch> getBranchList() {
        return branchList;
    }

    public Branch getBranchDetails(String id){
            for (Branch br:branchList)
                if(br.getId().equals(id))
                    return br;
            return  null;

    }

    public void editBranch(Branch branch) {
        int i = -1;
        for (Branch br:branchList)
            if(br.getId().equals(branch.getId()))
                i = branchList.indexOf(br);
        if(i!=-1){
            branchList.remove(i);
            branchList.add(i,branch);
        }
    }

}
