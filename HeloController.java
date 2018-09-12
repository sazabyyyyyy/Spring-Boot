package com.kaneko.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Takuya Kaneko
 *ブラウザからURLの末尾に0-4の整数値をつけてアクセスすると
 *その番号のデータがJSON形式で出力される
 */

@RestController
public class HeloController {

	String[] names ={"kaneko","kimura","kaneko","mnoriok","takuya"
	};

	String[] mails= {"stassiks.com","kankoe@ko.jp","eioko@sk.kp","hakpsoko@dd,kp"};




	//{num}がパス変数の指定
	@RequestMapping("/{id}")
	//@PathVariableのあとの引数がパス変数によって値を渡されるもの
	public  DataObject index(@PathVariable int id) {

		return new DataObject(id,names[id],mails[id]);

	}

}
class DataObject{
	private int id;
	private String name;
	private String value;

	//コンストラクタ
	public DataObject(int id, String name, String value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public int getId() {
		return id;
		}

	public void setId(int id) {
		this.id=id;
	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name=name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value=value;
	}




}
