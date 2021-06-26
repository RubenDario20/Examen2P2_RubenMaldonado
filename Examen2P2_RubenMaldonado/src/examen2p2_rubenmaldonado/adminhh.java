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
public class adminhh {

    private ArrayList<Hibrido_E> hibridoh = new ArrayList();
    private File archivo = null;

    public adminhh(String path) {
        archivo = new File(path);
    }

    public ArrayList<Hibrido_E> getHibridoh() {
        return hibridoh;
    }

    public void setHibridoh(ArrayList<Hibrido_E> hibridoh) {
        this.hibridoh = hibridoh;
    }



    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setHibridoh(Hibrido_E a) {
        hibridoh.add(a);
    }

    public void cargarArchivo() {
        try {
            hibridoh = new ArrayList();
            Hibrido_E temp;
            if (archivo.exists()) {
                FileInputStream entrada
                        = new FileInputStream(archivo);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Hibrido_E) objeto.readObject()) != null) {
                        hibridoh.add(temp);
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
            for (Hibrido_E t : hibridoh) {
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
