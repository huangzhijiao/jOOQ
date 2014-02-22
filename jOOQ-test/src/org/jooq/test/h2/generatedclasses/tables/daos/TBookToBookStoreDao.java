/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookToBookStoreDao extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.h2.generatedclasses.tables.pojos.TBookToBookStore, org.jooq.Record2<java.lang.String, java.lang.Integer>> {

	/**
	 * Create a new TBookToBookStoreDao without any configuration
	 */
	public TBookToBookStoreDao() {
		super(org.jooq.test.h2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.h2.generatedclasses.tables.pojos.TBookToBookStore.class);
	}

	/**
	 * Create a new TBookToBookStoreDao with an attached configuration
	 */
	public TBookToBookStoreDao(org.jooq.Configuration configuration) {
		super(org.jooq.test.h2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.h2.generatedclasses.tables.pojos.TBookToBookStore.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record2<java.lang.String, java.lang.Integer> getId(org.jooq.test.h2.generatedclasses.tables.pojos.TBookToBookStore object) {
		return compositeKeyRecord(object.getBookStoreName(), object.getBookId());
	}

	/**
	 * Fetch records that have <code>BOOK_STORE_NAME IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.TBookToBookStore> fetchByBookStoreName(java.lang.String... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, values);
	}

	/**
	 * Fetch records that have <code>BOOK_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.TBookToBookStore> fetchByBookId(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBookToBookStore.BOOK_ID, values);
	}

	/**
	 * Fetch records that have <code>STOCK IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.TBookToBookStore> fetchByStock(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBookToBookStore.STOCK, values);
	}
}
