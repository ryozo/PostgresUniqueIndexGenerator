package uidxgenerator.entity;

import java.io.Serializable;

import uidxgenerator.constants.SqlType;
import uidxgenerator.util.StringUtil;

/**
 * SQL文を表すEntityです。
 * @author W.Ryozo
 * @version 1.0
 */
public class SqlCommand implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/** SQL本文 */
	private String command;
	
	/**
	 * SQL文とSQL種別を利用してインスタンスを作成します。
	 * @param command SQL文
	 * @param type SQLの種別
	 */
	public SqlCommand(String command) {
		// TODO Builderクラスを検討、あと内容修正
		if (StringUtil.isNullOrEmpty(command)) {
			throw new IllegalArgumentException();
		}
		this.command = command;
	}
	
	/**
	 * SQL本文を取得します。
	 * @return
	 */
	public String getSqlCommand() {
		return command;
	}

	@Override
	public String toString() {
		return command;
	}
}
