package uidxgenerator.constants;

/**
 * SQLの種別を表す列挙子です
 * TODO 削除を検討
 * @author W.Ryozo
 * @version 1.0
 */
public enum SqlType {
	CREATETABLE,  // Create Table文
	CREATEINDEX,  // Create Index文
	OTHER,        // その他のSQL文
}
