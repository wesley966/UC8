package Banco;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import Modelo.Cliente;
import Modelo.Mesa;
import Modelo.Pedido;
import Modelo.Produto;
import java.util.ArrayList;

public class BancoSimulado {
   

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public static ArrayList<Produto> produtos = new ArrayList<>();

    public static ArrayList<Mesa> mesas = new ArrayList<>();

    public static ArrayList<Pedido> pedidos = new ArrayList<>();

    public static int idCliente = 1;

    public static int idProduto = 1;

    public static int idPedido = 1;
}

