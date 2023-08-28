/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BO;

import Modelo.Autor;
import Modelo.Categoria;
import java.util.List;

/**
 *
 * @author maria
 */
public class ContextoLivro {
    private static String tituloLivroCadastrado;
    private static Integer paginasLivroCadastrado;
    private static String editoraLivroCadastrado;
    private static Integer idAtual;
    private static List<Categoria> categoriaLivroCadastrado;
    private static List<Autor> autorLivroCadastrado;

    public static Integer getIdAtual() {
        return idAtual;
    }

    public static void setIdAtual(Integer idAtual) {
        ContextoLivro.idAtual = idAtual;
    }
    
    public static String getTituloLivroCadastrado() {
        return tituloLivroCadastrado;
    }

    public static void setTituloLivroCadastrado(String tituloLivroCadastrado) {
        ContextoLivro.tituloLivroCadastrado = tituloLivroCadastrado;
    }

    public static Integer getPaginasLivroCadastrado() {
        return paginasLivroCadastrado;
    }

    public static void setPaginasLivroCadastrado(Integer paginasLivroCadastrado) {
        ContextoLivro.paginasLivroCadastrado = paginasLivroCadastrado;
    }

    public static String getEditoraLivroCadastrado() {
        return editoraLivroCadastrado;
    }

    public static void setEditoraLivroCadastrado(String editoraLivroCadastrado) {
        ContextoLivro.editoraLivroCadastrado = editoraLivroCadastrado;
    }

    public static List<Categoria> getCategoriaLivroCadastrado() {
        return categoriaLivroCadastrado;
    }

    public static void setCategoriaLivroCadastrado(List<Categoria> categoriaLivroCadastrado) {
        ContextoLivro.categoriaLivroCadastrado = categoriaLivroCadastrado;
    }

    public static List<Autor> getAutorLivroCadastrado() {
        return autorLivroCadastrado;
    }

    public static void setAutorLivroCadastrado(List<Autor> autorLivroCadastrado) {
        ContextoLivro.autorLivroCadastrado = autorLivroCadastrado;
    }

    
}
