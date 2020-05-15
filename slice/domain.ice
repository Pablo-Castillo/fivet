/*
 * MIT License
 *
 * Copyright (c) 2020 Pablo-Castillo <pablo.castillo01@alumnos.ucn.cl>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// https://doc.zeroc.com/ice/3.7/language-mappings/java-mapping/client-side-slice-to-java-mapping/customizing-the-java-mapping
["java:package:cl.ucn.disc.pdis.fivet.zeroice"]
module model {


    /**
    *Clase Persona
    */
    class Persona{

        /**
        *PK
        */
        int id;

        /**
        *Nombre: Pablo Castillo Rojas
        */
        string nombre;

        /**
        *Rut: 182335622
        */
        string rut;

        /**
        *Direccion: unadireccion #7649
        */
        string direccion;

        /**
        *Telefono Fijo: +56 55 2785738
        */
        long telefonoFijo;

        /**
        *Celular: +56948729563
        */
        long celular;

        /**
        *Email: unemail@email.com
        */
        string email;
    }

    /**
    *Tipo de paciente
    */
    enum tipoPaciente {
        INTERNO,
        EXTERNO
    }

    /**
    *Sexo de paciente
    */
    enum Sexo {
        MACHO,
        HEMBRA
    }

    /**
    *Clase Ficha
    */
    class Ficha{

        /**
        *PK
        */
        int id;

        /**
        *Numero de ficha
        */
        int nFicha;

        /**
        *Nombre Paciente: Leonidas
        */
        string nombPaciente;

        /**
        *Especie: Perro/gato/etc
        */
        string especie;

        /**
        *Fecha de Nacimiento: dia/mes/año
        */
        string nacimiento;

        /**
        *Raza: Labrador
        */
        string raza;

        /**
        *Sexo: Macho/Hembra
        */
        string sexo;

        /**
        *Color: Negro
        */
        string color;

        /**
        *Tipo: Interno/Externo
        */
        string tipoPaciente;
    }

    /**
    *Clase Control
    */
    class Control{
        /**
        *PK
        */
        int id;

        /**
        *Fecha: dia/mes/año
        */
        string fecha;

        /**
        *Proximo Control: dia/mes/año
        */
        string proxControl;

        /**
        *Temperatura: 36°
        */
        int temperatura;

        /**
        *Peso: 30 Kg
        */
        double peso;

        /**
        *Altura: 60 cm
        */
        double altura;

        /**
        *Diagnostico: Problemas digestivos
        */
        string diagnostico;

        /**
        *Veterinario: Carlos Vidal Pinto
        */
        string veterinario;

    }

    /**
    *Clase Examen
    */
    class Examen{
        /**
        *PK
        */
        int id;

        /**
        *Nombre del Examen: Radiografia
        */
        string nomExamen;

        /**
        *Fecha del examen: dia/mes/año
        */
        string feExamen;
    }

    /**
    *Clase Foto
    */
    class Foto{
        /**
        *Foto: URL de la foto
        */
        string foto;
    }

    /**
    *Contratos
    */

    interface Contratos {
        /**
        * Dado un numero de ficha, retorna una ficha
        * @param numero de la ficha
        * @return Ficha
        */
        Ficha obtenerFicha(int numero);
        /**
        * Se ingresa un dueño al sistema
        * @param duenio
        */
        Persona ingresarDuenio(Persona duenio);
        /**
        * Se agrega un control al sistema
        * @param control
        */
        Control ingresarControl(Control control);
    }


    /**
     * The base system.
     */
     interface TheSystem {

        /**
         * @return the diference in time between client and server.
         */
        long getDelay(long clientTime);

     }

}
