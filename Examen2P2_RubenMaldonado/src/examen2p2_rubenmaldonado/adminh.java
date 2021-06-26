/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_rubenmaldonado;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Ruben Dario Arias
 */
public class adminh {

    private ArrayList<HIbrido_N> hibrido = new ArrayList();
    private File archivo = null;

    public adminh(String path) {
        archivo = new File(path);
    }

    public ArrayList<HIbrido_N> getHibrido() {
        return hibrido;
    }

    public void setHibrido(ArrayList<HIbrido_N> hibrido) {
        this.hibrido = hibrido;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setHibrido(HIbrido_N a) {
        hibrido.add(a);
    }

    public void cargarArchivo() {
        try {
            hibrido = new ArrayList();
            HIbrido_N temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (HIbrido_N) objeto.readObject()) != null) {
                        hibrido.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (HIbrido_N t : hibrido) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }

}
