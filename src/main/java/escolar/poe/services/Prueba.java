package escolar.poe.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prueba {
    private final Map<String, List<String>> prueba = new HashMap<>();
    public Prueba() {
        List<String> prueba1 = new ArrayList<>();
        prueba1.add("Viendo diagramas graficos o videos");
        prueba1.add("Escuchando explicaciones o audios");
        prueba1.add("Haciendo actividades practicas o experimentos");
        prueba.put("Como prefieres aprender nueva información?", prueba1);
        List<String> prueba2 = new ArrayList<>();
        prueba2.add("Visualizas una imagen o una escena");
        prueba2.add("Escuchas una voz o un sonido en tu mente");
        prueba2.add("Recuerdas el movimiento o la sensacion física");
        prueba.put("Cuando intentas recordar algo normalmente...", prueba2);
        List<String> prueba3 = new ArrayList<>();
        prueba3.add("El profesor utiliza presentaciones visuales o dibuja en la pizarra");
        prueba3.add("El profesor explica detalladamente el tema");
        prueba3.add("Participas en actividades prácticas o en debates");
        prueba.put("En una clase te resulta mas facil aprender cuando...", prueba3);
        List<String> prueba4 = new ArrayList<>();
        prueba4.add("Ver ilustraciones o graficos que acompañen el texto");
        prueba4.add("Leer en voz alta o escuchar una version de audio");
        prueba4.add("Tomar notas o subrayar mientras lees");
        prueba.put("Cuando lees un libro prefieres...", prueba4);
        List<String> prueba5 = new ArrayList<>();
        prueba5.add("Crear esquemas, mapas mentales o graficos");
        prueba5.add("Grabar tus notas y escucharlas");
        prueba5.add("Hacer ejercicios prácticos o usar tarjetas de memoria");
        prueba.put("Cuando estudias para un examen sueles...", prueba5);
        List<String> prueba6 = new ArrayList<>();
        prueba6.add("Leer el manual de instrucciones con imágenes");
        prueba6.add("Escuchar una explciación o un tutorial de audio");
        prueba6.add("Manipular el dispositivo y aprender experimentando");
        prueba.put("Si necesitas aprender como usar un nuevo dispositivo que haces?", prueba6);
        List<String> prueba7 = new ArrayList<>();
        prueba7.add("Las expresiones faciales y el lenguaje corporal");
        prueba7.add("Las palabras y el tono de voz");
        prueba7.add("Las emociones y la energia de la conversación");
        prueba.put("En que te concentras durante una conversación", prueba7);
        List<String> prueba8 = new ArrayList<>();
        prueba8.add("Ver a alguien mas hacerlo primero");
        prueba8.add("Escuchar a alguien explicar como se hace");
        prueba8.add("Intentarlo tu mismo y aprender sobre la marcha");
        prueba.put("Que haces al aprender una nueva habilidad?", prueba8);
        List<String> prueba9 = new ArrayList<>();
        prueba9.add("Visualizar la cara de la persona");
        prueba9.add("Recordar como suena el nombre");
        prueba9.add("Asociar el nombre a una actividad o movimiento");
        prueba.put("Que te ayuda mas al intentar recordar un nombre?", prueba9);
        List<String> prueba10 = new ArrayList<>();
        prueba10.add("Ver una pelicula o mirar fotos");
        prueba10.add("Escuchar musica o un podcast");
        prueba10.add("Hacer ejercicio o una actividad");
        prueba.put("Que prefieres para relajarte después de un dia largo?", prueba10);
    }

    public Map<String, List<String>> getPrueba() {
        return prueba;
    }
}
