/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.inteligenttexteditor;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Sanaullah
 */
public class FileTypeFilter extends FileFilter{
    private final String extension;
    private final String discription;
    public FileTypeFilter(String extension,String discription){
    this.extension=extension;
    this.discription=discription;
    }
    @Override
    public boolean accept(File file) {
        if(file.isDirectory()){
        return true;
        }
        return file.getName().endsWith(extension);
 }

    @Override
    public String getDescription() {
 return discription+String.format("(*%s)",extension);
    }
}
