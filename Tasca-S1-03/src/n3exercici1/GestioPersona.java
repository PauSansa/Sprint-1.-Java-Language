package n3exercici1;

import java.util.ArrayList;
import java.util.List;

public class GestioPersona {
    private List<Persona> personas = new ArrayList<>();

    public void afegirPersona(){
        String nom = EntryPersona.llegirString("Introdueixi nom: \n");
        String cognom = EntryPersona.llegirString("Introdueixi cognom: \n");
        String dni = EntryPersona.llegirString("Introdueixi dni: \n");
        personas.add(new Persona(nom,cognom,dni));
    }

    public List<Persona> getPersonas() {
        return personas;
    }
}
