package database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.connection.ConnectionFactory;
import model.Character;
import utils.SqlUtil;

public class DaoCharacter implements DaoInterface<Character> {

	Connection connection;
	PreparedStatement preparedStatement;

	@Override
	public boolean add(Character character) throws SQLException {
		connection = ConnectionFactory.obterConexao();
		int count = 1;
		String sql = SqlUtil.buildQueryAdd("character", "name", "strength", "age", "constitution", "dexterity", "intelligence", "wisdom",
				"charisma");

		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(count++, character.getName());
		preparedStatement.setInt(count++, character.getStrength());
		preparedStatement.setInt(count++, character.getAge());
		preparedStatement.setInt(count++, character.getConstitution());
		preparedStatement.setInt(count++, character.getDexterity());
		preparedStatement.setInt(count++, character.getIntelligence());
		preparedStatement.setInt(count++, character.getWisdom());
		preparedStatement.setInt(count++, character.getCharisma());
		return preparedStatement.executeUpdate() == 1;

	}

	@Override
	public boolean removeById(Integer id) throws SQLException {
		connection = ConnectionFactory.obterConexao();
		String sql = SqlUtil.buildQueryDelete("character", "id_character");

		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		return preparedStatement.executeUpdate() == 1;

	}

	@Override
	public boolean update(Character character) throws SQLException {
		connection = ConnectionFactory.obterConexao();
		int count = 1;
		String sql = SqlUtil.buildQueryUpdate("character", "name", "strength", "age", "constitution", "dexterity", "intelligence", "wisdom",
				"charisma", "id_character");

		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(count++, character.getName());
		preparedStatement.setInt(count++, character.getStrength());
		preparedStatement.setInt(count++, character.getAge());
		preparedStatement.setInt(count++, character.getConstitution());
		preparedStatement.setInt(count++, character.getDexterity());
		preparedStatement.setInt(count++, character.getIntelligence());
		preparedStatement.setInt(count++, character.getWisdom());
		preparedStatement.setInt(count++, character.getCharisma());
		preparedStatement.setInt(count++, character.getId());
		return preparedStatement.executeUpdate() == 1;

	}

	@Override
	public List<Character> getAll() throws SQLException {
		List<Character> characters = new ArrayList<>();
		connection = ConnectionFactory.obterConexao();
		String sql = SqlUtil.buildQueryGetAllOrById("character");

		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.execute();
		ResultSet resultSet = preparedStatement.getResultSet();
		while (resultSet.next()) {
			Character character = new Character();
			character.setId(resultSet.getInt("id_character"));
			character.setName(resultSet.getString("name"));
			character.setStrength(resultSet.getInt("strength"));
			character.setAge(resultSet.getInt("age"));
			character.setConstitution(resultSet.getInt("constitution"));
			character.setDexterity(resultSet.getInt("dexterity"));
			character.setIntelligence(resultSet.getInt("intelligence"));
			character.setWisdom(resultSet.getInt("wisdom"));
			character.setCharisma(resultSet.getInt("charisma"));
			characters.add(character);
		}

		return characters;

	}

	@Override
	public Character getById(Integer id) throws SQLException {
		Character character = new Character();
		connection = ConnectionFactory.obterConexao();
		String sql = SqlUtil.buildQueryGetAllOrById("user", "id_user", id);
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.execute();
		ResultSet resultSet = preparedStatement.getResultSet();
		while (resultSet.next()) {
			character.setId(resultSet.getInt("id_character"));
			character.setName(resultSet.getString("name"));
			character.setStrength(resultSet.getInt("strength"));
			character.setAge(resultSet.getInt("age"));
			character.setConstitution(resultSet.getInt("constitution"));
			character.setDexterity(resultSet.getInt("dexterity"));
			character.setIntelligence(resultSet.getInt("intelligence"));
			character.setWisdom(resultSet.getInt("wisdom"));
			character.setCharisma(resultSet.getInt("charisma"));
			return character;
		}

		return null;
	}
	
}
