import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*        ProductoEspecifico objProducto1 = new ProductoEspecifico(1,"Lapiz",2000, "Papeleria","Big");
        ProductoEspecifico objProducto2 = new ProductoEspecifico(2,"Cuaderno",6000, "Cuaderno","Norma");
        Inventario objInventario = new Inventario();
        objInventario.agregarProducto(objProducto1);
        objInventario.agregarProducto(objProducto2);

        System.out.println("Antes de eliminar");
        objInventario.listarProductos();

        objInventario.eliminarProducto(2);
        System.out.println("Despues de eliminar");
        objInventario.listarProductos();

        System.out.println(objInventario.buscarPorNombre("Lapiz"));*/
        Scanner objScanner = new Scanner(System.in);
        Inventario objInventario = new Inventario();

        String option = "";
        while (!option.equals("6")){
            System.out.println("Ingrese 1 para Agregar producto, 2. para elminar, 3 Buscar por numbre" +
                    "4. Buscar por categoria, 5. Listar inventario " +
                    "6. Salir");
            option = objScanner.nextLine();


            switch (option){
                case "1":
                    String String = "";
                    System.out.println("Ingrese el id del producto");
                    int idProduct = objScanner.nextInt();

                    System.out.println("Ingrese el nombre del producto");
                    String nombre = objScanner.next();

                    System.out.println("Ingrese el precio del producto");
                    double precio = objScanner.nextDouble();

                    System.out.println("Ingrese la categoria del producto");
                    String categoria = objScanner.next();

                    System.out.println("Ingrese la marca del producto");
                    String marca = objScanner.next();

                    ProductoEspecifico objProducto = new ProductoEspecifico(idProduct,nombre,precio, categoria,marca);
                    objInventario.agregarProducto(objProducto);

                    break;
                case "2":
                    System.out.println("Ingrese el id a elimianr ");
                    int idEliminar = objScanner.nextInt();
                    if (objInventario.eliminarProducto(idEliminar)){
                        System.out.println("producto elminado con exito");
                    }else {
                        System.out.println("Producto no encontrado");
                    }
                    break;
                case "3":
                    System.out.println("Ingrese el nombre del producto a buscar \n");
                    String nombreBuscar = objScanner.nextLine();
                    System.out.println(objInventario.buscarPorNombre(nombreBuscar));
                    break;

                case "4":
                    System.out.println("Ingrese la categoria del producto a buscar \n");
                    String categoriaBuscar = objScanner.nextLine();
                    System.out.println(objInventario.buscarPorCategoria(categoriaBuscar));
                    break;

                case "5":
                    objInventario.listarProductos();
                    break;

                case "6":
                    System.out.println("gracias por usar nuestro programa");
                    break;
                default:
                    System.out.println("opcion no valida ");
            }

        }

        
    }
}