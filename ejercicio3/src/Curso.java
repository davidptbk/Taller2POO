import java.util.ArrayList;
import java.util.Scanner;

public class Curso {

    private String codigo;
    private String nombre;

    private ArrayList<Estudiante> listaEstudiantes;
    private static int index =1;
    //un metodo estatico es el que se puede usar sin tener que instanciar la clase
    //basicamente es una variable global
    public Curso(String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }
    public void agregarEstudiante(Scanner objScan){
        objScan.nextLine();
        System.out.println("Ingrese el nombre del estudiante");
        String estudiante = objScan.nextLine();

        System.out.println("Ingrese el correo del estudiante");
        String email = objScan.next();

        Estudiante objEstudiante = new Estudiante(index,nombre,email);
        index++;

        this.listaEstudiantes.add(objEstudiante);
        System.out.println("Estudiante agregado correctamente ");
    }

    public void eliminarEstudiante(Scanner objScan){
        this.listarEstudiantes();
        System.out.println("Ingrese el id del estudiante a eliminar");
        int idEliminar = objScan.nextInt();
        //Eliminar el estudiante si su id coincide con el id a Eliminar (idEliminar)
        boolean eliminado = this.listaEstudiantes.removeIf(estudiante -> estudiante.getId() == idEliminar);
        if (eliminado){
            System.out.println("Estudiante eliminado correctamente");
        }else {
            System.out.println("No se pudo eliminar al estudiante");
        }
    }

    public void listarEstudiantes(){
        System.out.println("Lista de estudiantes del Curso".concat(this.nombre));
        if (this.listaEstudiantes.isEmpty()){
            System.out.println("NO hay estudiantes");
        }else {
            for (Estudiante temporal: listaEstudiantes){

                System.out.println(temporal.toString());
            }

        }
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}
