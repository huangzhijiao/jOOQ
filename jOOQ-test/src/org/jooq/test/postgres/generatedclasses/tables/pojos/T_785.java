package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_785 implements org.jooq.test.postgres.generatedclasses.tables.interfaces.IT_785 {

	private static final long serialVersionUID = 126635113;

	private final java.lang.Integer id;
	private final java.lang.String  name;
	private final java.lang.String  value;

	public T_785(
		java.lang.Integer id,
		java.lang.String  name,
		java.lang.String  value
	) {
		this.id = id;
		this.name = name;
		this.value = value;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public java.lang.String getName() {
		return this.name;
	}

	@Override
	public java.lang.String getValue() {
		return this.value;
	}
}
