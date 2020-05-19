/**************************************************************************************************
 * MIT License                                                                                    *
 *                                                                                                *
 * Copyright (c) 2020 Pablo-Castillo <pablo.castillo01@alumnos.ucn.cl>.                           *
 *                                                                                                *
 * Permission is hereby granted, free of charge, to any person obtaining a copy                   *
 * of this software and associated documentation files (the "Software"), to deal                  *
 * in the Software without restriction, including without limitation the rights                   *
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell                      *
 * copies of the Software, and to permit persons to whom the Software is                          *
 * furnished to do so, subject to the following conditions:                                       *
 *                                                                                                *
 * The above copyright notice and this permission notice shall be included in all                 *
 * copies or substantial portions of the Software.                                                *
 *                                                                                                *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR                     *
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,                       *
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE                    *
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER                         *
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,                  *
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE                  *
 * SOFTWARE.                                                                                      *
 **************************************************************************************************/

package cl.ucn.disc.pdis.fivet.repository;

import java.sql.SQLException;
import java.util.List;

public interface GenericCRUD<T,K> {

    /**
     * Creates a registry in the database
     * @param element to be created
     */
    boolean crear (T element) throws SQLException;

    /**
     * Deletes a registry from database
     * @param id to be deleted
     */
    boolean eliminar(K id) throws SQLException;

    /**
     * Updates an existing T registry
     * @param element to be updated
     */
    boolean actualizar (T element) throws SQLException;

    /**
     * finds an especific registry in the database
     * @param id for searching
     */
    T buscar(K id) throws SQLException;

    /**
     * Gets all the data in the table T
     */
    List<T> obtenerTodo() throws SQLException;

}
