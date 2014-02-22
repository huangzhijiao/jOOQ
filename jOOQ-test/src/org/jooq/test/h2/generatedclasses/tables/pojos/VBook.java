/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VBook implements org.jooq.test.h2.generatedclasses.tables.interfaces.IVBook {

	private static final long serialVersionUID = -1039071113;

	private java.lang.Integer  id;
	private java.lang.Integer  authorId;
	private java.lang.Integer  coAuthorId;
	private java.lang.Integer  detailsId;
	private java.lang.String   title;
	private java.lang.Integer  publishedIn;
	private java.lang.Integer  languageId;
	private java.lang.String   contentText;
	private byte[]             contentPdf;
	private java.lang.Integer  recVersion;
	private java.sql.Timestamp recTimestamp;

	public VBook() {}

	public VBook(
		java.lang.Integer  id,
		java.lang.Integer  authorId,
		java.lang.Integer  coAuthorId,
		java.lang.Integer  detailsId,
		java.lang.String   title,
		java.lang.Integer  publishedIn,
		java.lang.Integer  languageId,
		java.lang.String   contentText,
		byte[]             contentPdf,
		java.lang.Integer  recVersion,
		java.sql.Timestamp recTimestamp
	) {
		this.id = id;
		this.authorId = authorId;
		this.coAuthorId = coAuthorId;
		this.detailsId = detailsId;
		this.title = title;
		this.publishedIn = publishedIn;
		this.languageId = languageId;
		this.contentText = contentText;
		this.contentPdf = contentPdf;
		this.recVersion = recVersion;
		this.recTimestamp = recTimestamp;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public VBook setId(java.lang.Integer id) {
		this.id = id;
		return this;
	}

	@Override
	public java.lang.Integer getAuthorId() {
		return this.authorId;
	}

	@Override
	public VBook setAuthorId(java.lang.Integer authorId) {
		this.authorId = authorId;
		return this;
	}

	@Override
	public java.lang.Integer getCoAuthorId() {
		return this.coAuthorId;
	}

	@Override
	public VBook setCoAuthorId(java.lang.Integer coAuthorId) {
		this.coAuthorId = coAuthorId;
		return this;
	}

	@Override
	public java.lang.Integer getDetailsId() {
		return this.detailsId;
	}

	@Override
	public VBook setDetailsId(java.lang.Integer detailsId) {
		this.detailsId = detailsId;
		return this;
	}

	@Override
	public java.lang.String getTitle() {
		return this.title;
	}

	@Override
	public VBook setTitle(java.lang.String title) {
		this.title = title;
		return this;
	}

	@Override
	public java.lang.Integer getPublishedIn() {
		return this.publishedIn;
	}

	@Override
	public VBook setPublishedIn(java.lang.Integer publishedIn) {
		this.publishedIn = publishedIn;
		return this;
	}

	@Override
	public java.lang.Integer getLanguageId() {
		return this.languageId;
	}

	@Override
	public VBook setLanguageId(java.lang.Integer languageId) {
		this.languageId = languageId;
		return this;
	}

	@Override
	public java.lang.String getContentText() {
		return this.contentText;
	}

	@Override
	public VBook setContentText(java.lang.String contentText) {
		this.contentText = contentText;
		return this;
	}

	@Override
	public byte[] getContentPdf() {
		return this.contentPdf;
	}

	@Override
	public VBook setContentPdf(byte[] contentPdf) {
		this.contentPdf = contentPdf;
		return this;
	}

	@Override
	public java.lang.Integer getRecVersion() {
		return this.recVersion;
	}

	@Override
	public VBook setRecVersion(java.lang.Integer recVersion) {
		this.recVersion = recVersion;
		return this;
	}

	@Override
	public java.sql.Timestamp getRecTimestamp() {
		return this.recTimestamp;
	}

	@Override
	public VBook setRecTimestamp(java.sql.Timestamp recTimestamp) {
		this.recTimestamp = recTimestamp;
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IVBook from) {
		setId(from.getId());
		setAuthorId(from.getAuthorId());
		setCoAuthorId(from.getCoAuthorId());
		setDetailsId(from.getDetailsId());
		setTitle(from.getTitle());
		setPublishedIn(from.getPublishedIn());
		setLanguageId(from.getLanguageId());
		setContentText(from.getContentText());
		setContentPdf(from.getContentPdf());
		setRecVersion(from.getRecVersion());
		setRecTimestamp(from.getRecTimestamp());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IVBook> E into(E into) {
		into.from(this);
		return into;
	}
}
