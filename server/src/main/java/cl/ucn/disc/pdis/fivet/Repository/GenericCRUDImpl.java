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

import cl.ucn.disc.pdis.fivet.models.Persona;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.List;

public class GenericCRUDImpl<T,K> implements GenericCRUD<T,K> {

    /**
     * Dao to manage the database connection
     */
    private final Dao<T,K> dao;

    /**
     * Constructor of dao
     * @param connectionSource
     * @param theClass
     * @throws SQLException
     */
    public GenericCRUDImpl(ConnectionSource connectionSource, Class<T> theClass) throws SQLException {

        TableUtils.createTableIfNotExists(connectionSource, theClass);
        this.dao = DaoManager.createDao(connectionSource, theClass);
    }


    /**
     *
     * @param element to be created
     * @return
     * @throws SQLException
     */
    @Override
    public boolean crear(T element) throws SQLException {

        int objeto = dao.create(element);
        return objeto == 1;
    }

    /**
     *
     * @param id to be deleted
     * @return
     * @throws SQLException
     */
    @Override
    public boolean eliminar(K id) throws SQLException {

        int objeto = dao.deleteById(id);
        return objeto == 1;

    }

    /**
     *
     * @param element to be updated
     * @return
     * @throws SQLException
     */
    @Override
    public boolean actualizar(T element) throws SQLException {

        int objeto = dao.update(element);
        return objeto == 1;

    }

    /**
     *
     * @param id for searching
     * @return
     * @throws SQLException
     */
    @Override
    public T buscar(K id) throws SQLException {

        T objeto = dao.queryForId(id);
        return objeto;

    }

    /**
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<T> obtenerTodo() throws SQLException {

        List<T> list = dao.queryForAll();
        return list;

    }
}
