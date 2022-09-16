public class Main {
    public static void main(String[] args) {



        Alumno alumno = new Alumno("Pablo", "Velez", 1);

        Alumno otroAlumno = new Alumno("Agustin",  "Ferres", 2);

        Examen examenPablo = new ExamenParcial(alumno, "POO", "La Universidad de la Nueva Enseñanza está comenzando una nueva carrera con un convenio que hizo con la compañía Todo en Casa S.A. y necesita administrar los parciales y finales de los alumnos. ", 10.0, 3, 2);

        Examen examenAgustin = new ExamenParcial(otroAlumno, "POO", "La Universidad de la Nueva Enseñanza está comenzando una nueva carrera con un convenio que hizo con la compañía Todo en Casa S.A. y necesita administrar los parciales y finales de los alumnos. ", 9.0, 4, 2);


       /* System.out.println(examenPablo.getNota());
        System.out.println(examenAgustin.getNota());

        ExamenFinal finalPablo = (ExamenFinal) examenPablo;
        ExamenFinal finalAgustin = (ExamenFinal) examenAgustin;


        System.out.println(finalPablo.getNotaOral());
        System.out.println(finalAgustin.getNotaOral());

        System.out.println(examenPablo.estaAprobado());
        System.out.println(examenAgustin.estaAprobado());


        System.out.println(finalAgustin.compareTo(finalPablo));*/

        ExamenParcial parcialPablo = (ExamenParcial) examenPablo;
        ExamenParcial parcialAgustin = (ExamenParcial) examenAgustin;


        System.out.println(parcialPablo.puedeRecuperar());
        System.out.println(parcialAgustin.puedeRecuperar());

    }
}