import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instancias
        Scanner objScan = new Scanner(System.in);

        GestionCurso objGestion = new GestionCurso();
        int option=0;
        int option2=0;
        do {
            System.out.println("""
                Menu de opciones
                1. Administrar estudiantes
                2. Administrar cursos
                3. Salir
                    """);

            option = objScan.nextInt();

            switch (option){
                case 1:
                    int option3 = 0;
                    do {
                        System.out.println("""
                            Menu de estudiantes
                            1. Agregar Estudiante a un curso
                            2. Listar todos los estudiantes de un curso
                            3. Eliminar estudiante de un curso
                            4.salir
                            
                            Ingrese una opcion: 
                            """);
                        switch (option3){
                            case 1:
                                objGestion.listarTodosLosCursos();
                                System.out.println("Ingresa el codigo del curso donde ingresaras el nuevo estudiante");
                                String codigo = objScan.next();

                                Curso objCurso = objGestion.buscarCursoPorCodigo(codigo);
                                if (objCurso == null){
                                    System.out.println("El codigo ingresado no es valido");
                                }else {
                                    objCurso.agregarEstudiante(objScan);
                                }

                                break;
                            case 2:
                                objGestion.listarTodosLosCursos();
                                System.out.println("Ingresa el codigo del curso que va a listar");
                                codigo = objScan.next();

                                objCurso = objGestion.buscarCursoPorCodigo(codigo);
                                if (objCurso == null){
                                    System.out.println("El codigo ingresado no es valido");
                                }else {
                                    objCurso.listarEstudiantes();
                                }
                                break;
                            case 3://Eliminar estudiante de un curso

                                //1 listar el curso
                                objGestion.listarTodosLosCursos();
                                //2 Preguntar el codigo del curso
                                System.out.println("Ingrese el codigo del curso donde deseas elimianr");
                                codigo = objScan.next();
                                //3. Buscar el curso que tenga ese codigo
                                objCurso = objGestion.buscarCursoPorCodigo(codigo);
                                if (objCurso == null){
                                    System.out.println("El codigo ingresado no es de ningun curso");
                                }else {
                                    //4 Eliminar el estudiante de ese curso encontrado
                                    objCurso.eliminarEstudiante(objScan);
                                }


                                break;
                        }
                    }while (option3 != 4);

                    break;

                case 2:
                    do {
                        System.out.println("""
                            1. Agregar curso
                            2. Listar cursos
                            3. Buscar por codigo
                            4. Salir 
                            Ingrese una opcion: 
                                   """);
                            option2 = objScan.nextInt();

                        switch (option2){
                            case 1:
                                objGestion.agregarCurso(objScan);
                                break;
                            case 2:
                                objGestion.listarTodosLosCursos();

                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del curso a buscar");
                                String codigo = objScan.next();

                                Curso objCurso = objGestion.buscarCursoPorCodigo(codigo);
                                if (objGestion.buscarCursoPorCodigo(codigo) == null){
                                    System.out.println("No existe ningun curso con este codigo");
                                }else {
                                    System.out.println(objCurso.toString());
                                }

                                break;

                            case 4:
                                System.out.println("Graciar por usar el programa");
                        }
                    }while (option2 != 4);

                    break;


                case 3:
                    System.out.println("Gracias por venir");
                    break;
            }

        }while (option != 3);

    }
}