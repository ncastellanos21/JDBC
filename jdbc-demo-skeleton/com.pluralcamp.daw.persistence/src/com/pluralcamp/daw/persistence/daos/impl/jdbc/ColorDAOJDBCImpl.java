package com.pluralcamp.daw.persistence.daos.impl.jdbc;

import com.pluralcamp.daw.entities.core.Color;
import com.pluralcamp.daw.persistence.daos.contracts.ColorDAO;
import com.pluralcamp.daw.persistence.exceptions.DAOException;

import java.util.List;

public class ColorDAOJDBCImpl implements ColorDAO {
    @Override
    public Color getColorById(long id) throws DAOException {

        //Objectes que calen:
        //1er objecte - Connexio, via DriverManager de JDBC
        //2n objecte - Obrir un canal de Consulta - PraparedStatement
        //2.1 - Enviar la consulta SQL
        //3er objecte - Obrir un canal de Lectura, un cursor - ResultSet

        return null;
    }

    @Override
    public List<Color> getColors() throws DAOException {
        return null;
    }

    @Override
    public List<Color> getColors(int offset, int count) throws DAOException {
        return null;
    }

    @Override
    public List<Color> getColors(String searchTerm) throws DAOException {
        return null;
    }

    @Override
    public List<Color> getColors(String searchTerm, int offset, int count) throws DAOException {
        return null;
    }
}
