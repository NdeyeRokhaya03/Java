package repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Cours;

public class CoursRepository extends Database {
    private final String SQL_SELECT_COURS="select * from cours";
    private final String SQL_INSERT_COURS="INSERT INTO `COURS` ( `id`,`heuredebut`,'heurefin') VALUES (?,?,?);";
    private final String SQL_SELECT_COURS_BY_ID="SELECT * FROM `cours` where id like ? ";

  

    







































}