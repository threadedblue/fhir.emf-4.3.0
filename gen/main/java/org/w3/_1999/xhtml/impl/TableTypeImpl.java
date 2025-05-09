/**
 */
package org.w3._1999.xhtml.impl;

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._1999.xhtml.CaptionType;
import org.w3._1999.xhtml.ColType;
import org.w3._1999.xhtml.ColgroupType;
import org.w3._1999.xhtml.DirType;
import org.w3._1999.xhtml.TFrame;
import org.w3._1999.xhtml.TRules;
import org.w3._1999.xhtml.TableType;
import org.w3._1999.xhtml.TbodyType;
import org.w3._1999.xhtml.TfootType;
import org.w3._1999.xhtml.TheadType;
import org.w3._1999.xhtml.TrType;
import org.w3._1999.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getCaption <em>Caption</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getCol <em>Col</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getColgroup <em>Colgroup</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getThead <em>Thead</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getTfoot <em>Tfoot</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getTbody <em>Tbody</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getCellpadding <em>Cellpadding</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getCellspacing <em>Cellspacing</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3._1999.xhtml.impl.TableTypeImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableTypeImpl extends MinimalEObjectImpl.Container implements TableType {
	/**
	 * The cached value of the '{@link #getCaption() <em>Caption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaption()
	 * @generated
	 * @ordered
	 */
	protected CaptionType caption;

	/**
	 * The cached value of the '{@link #getCol() <em>Col</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol()
	 * @generated
	 * @ordered
	 */
	protected EList<ColType> col;

	/**
	 * The cached value of the '{@link #getColgroup() <em>Colgroup</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColgroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ColgroupType> colgroup;

	/**
	 * The cached value of the '{@link #getThead() <em>Thead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThead()
	 * @generated
	 * @ordered
	 */
	protected TheadType thead;

	/**
	 * The cached value of the '{@link #getTfoot() <em>Tfoot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTfoot()
	 * @generated
	 * @ordered
	 */
	protected TfootType tfoot;

	/**
	 * The cached value of the '{@link #getTbody() <em>Tbody</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbody()
	 * @generated
	 * @ordered
	 */
	protected EList<TbodyType> tbody;

	/**
	 * The cached value of the '{@link #getTr() <em>Tr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTr()
	 * @generated
	 * @ordered
	 */
	protected EList<TrType> tr;

	/**
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected BigInteger border = BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellpadding() <em>Cellpadding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellpadding()
	 * @generated
	 * @ordered
	 */
	protected static final String CELLPADDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellpadding() <em>Cellpadding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellpadding()
	 * @generated
	 * @ordered
	 */
	protected String cellpadding = CELLPADDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getCellspacing() <em>Cellspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellspacing()
	 * @generated
	 * @ordered
	 */
	protected static final String CELLSPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCellspacing() <em>Cellspacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellspacing()
	 * @generated
	 * @ordered
	 */
	protected String cellspacing = CELLSPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected List<String> class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected static final DirType DIR_EDEFAULT = DirType.LTR;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected DirType dir = DIR_EDEFAULT;

	/**
	 * This is true if the Dir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dirESet;

	/**
	 * The default value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected static final TFrame FRAME_EDEFAULT = TFrame.VOID;

	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected TFrame frame = FRAME_EDEFAULT;

	/**
	 * This is true if the Frame attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frameESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang1() <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang1()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang1() <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang1()
	 * @generated
	 * @ordered
	 */
	protected String lang1 = LANG1_EDEFAULT;

	/**
	 * The default value of the '{@link #getRules() <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected static final TRules RULES_EDEFAULT = TRules.NONE;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected TRules rules = RULES_EDEFAULT;

	/**
	 * This is true if the Rules attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rulesESet;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.eINSTANCE.getTableType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaptionType getCaption() {
		return caption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaption(CaptionType newCaption, NotificationChain msgs) {
		CaptionType oldCaption = caption;
		caption = newCaption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__CAPTION, oldCaption, newCaption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaption(CaptionType newCaption) {
		if (newCaption != caption) {
			NotificationChain msgs = null;
			if (caption != null)
				msgs = ((InternalEObject)caption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XhtmlPackage.TABLE_TYPE__CAPTION, null, msgs);
			if (newCaption != null)
				msgs = ((InternalEObject)newCaption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XhtmlPackage.TABLE_TYPE__CAPTION, null, msgs);
			msgs = basicSetCaption(newCaption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__CAPTION, newCaption, newCaption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ColType> getCol() {
		if (col == null) {
			col = new EObjectContainmentEList<ColType>(ColType.class, this, XhtmlPackage.TABLE_TYPE__COL);
		}
		return col;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ColgroupType> getColgroup() {
		if (colgroup == null) {
			colgroup = new EObjectContainmentEList<ColgroupType>(ColgroupType.class, this, XhtmlPackage.TABLE_TYPE__COLGROUP);
		}
		return colgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TheadType getThead() {
		return thead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThead(TheadType newThead, NotificationChain msgs) {
		TheadType oldThead = thead;
		thead = newThead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__THEAD, oldThead, newThead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThead(TheadType newThead) {
		if (newThead != thead) {
			NotificationChain msgs = null;
			if (thead != null)
				msgs = ((InternalEObject)thead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XhtmlPackage.TABLE_TYPE__THEAD, null, msgs);
			if (newThead != null)
				msgs = ((InternalEObject)newThead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XhtmlPackage.TABLE_TYPE__THEAD, null, msgs);
			msgs = basicSetThead(newThead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__THEAD, newThead, newThead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TfootType getTfoot() {
		return tfoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTfoot(TfootType newTfoot, NotificationChain msgs) {
		TfootType oldTfoot = tfoot;
		tfoot = newTfoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__TFOOT, oldTfoot, newTfoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTfoot(TfootType newTfoot) {
		if (newTfoot != tfoot) {
			NotificationChain msgs = null;
			if (tfoot != null)
				msgs = ((InternalEObject)tfoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XhtmlPackage.TABLE_TYPE__TFOOT, null, msgs);
			if (newTfoot != null)
				msgs = ((InternalEObject)newTfoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XhtmlPackage.TABLE_TYPE__TFOOT, null, msgs);
			msgs = basicSetTfoot(newTfoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__TFOOT, newTfoot, newTfoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TbodyType> getTbody() {
		if (tbody == null) {
			tbody = new EObjectContainmentEList<TbodyType>(TbodyType.class, this, XhtmlPackage.TABLE_TYPE__TBODY);
		}
		return tbody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrType> getTr() {
		if (tr == null) {
			tr = new EObjectContainmentEList<TrType>(TrType.class, this, XhtmlPackage.TABLE_TYPE__TR);
		}
		return tr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorder(BigInteger newBorder) {
		BigInteger oldBorder = border;
		border = newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCellpadding() {
		return cellpadding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCellpadding(String newCellpadding) {
		String oldCellpadding = cellpadding;
		cellpadding = newCellpadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__CELLPADDING, oldCellpadding, cellpadding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCellspacing() {
		return cellspacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCellspacing(String newCellspacing) {
		String oldCellspacing = cellspacing;
		cellspacing = newCellspacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__CELLSPACING, oldCellspacing, cellspacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<String> getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClass(List<String> newClass) {
		List<String> oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirType getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDir(DirType newDir) {
		DirType oldDir = dir;
		dir = newDir == null ? DIR_EDEFAULT : newDir;
		boolean oldDirESet = dirESet;
		dirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__DIR, oldDir, dir, !oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDir() {
		DirType oldDir = dir;
		boolean oldDirESet = dirESet;
		dir = DIR_EDEFAULT;
		dirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.TABLE_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDir() {
		return dirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFrame getFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrame(TFrame newFrame) {
		TFrame oldFrame = frame;
		frame = newFrame == null ? FRAME_EDEFAULT : newFrame;
		boolean oldFrameESet = frameESet;
		frameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__FRAME, oldFrame, frame, !oldFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFrame() {
		TFrame oldFrame = frame;
		boolean oldFrameESet = frameESet;
		frame = FRAME_EDEFAULT;
		frameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.TABLE_TYPE__FRAME, oldFrame, FRAME_EDEFAULT, oldFrameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFrame() {
		return frameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLang1() {
		return lang1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLang1(String newLang1) {
		String oldLang1 = lang1;
		lang1 = newLang1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__LANG1, oldLang1, lang1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRules getRules() {
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRules(TRules newRules) {
		TRules oldRules = rules;
		rules = newRules == null ? RULES_EDEFAULT : newRules;
		boolean oldRulesESet = rulesESet;
		rulesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__RULES, oldRules, rules, !oldRulesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRules() {
		TRules oldRules = rules;
		boolean oldRulesESet = rulesESet;
		rules = RULES_EDEFAULT;
		rulesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.TABLE_TYPE__RULES, oldRules, RULES_EDEFAULT, oldRulesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRules() {
		return rulesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TABLE_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.TABLE_TYPE__CAPTION:
				return basicSetCaption(null, msgs);
			case XhtmlPackage.TABLE_TYPE__COL:
				return ((InternalEList<?>)getCol()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.TABLE_TYPE__COLGROUP:
				return ((InternalEList<?>)getColgroup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.TABLE_TYPE__THEAD:
				return basicSetThead(null, msgs);
			case XhtmlPackage.TABLE_TYPE__TFOOT:
				return basicSetTfoot(null, msgs);
			case XhtmlPackage.TABLE_TYPE__TBODY:
				return ((InternalEList<?>)getTbody()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.TABLE_TYPE__TR:
				return ((InternalEList<?>)getTr()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XhtmlPackage.TABLE_TYPE__CAPTION:
				return getCaption();
			case XhtmlPackage.TABLE_TYPE__COL:
				return getCol();
			case XhtmlPackage.TABLE_TYPE__COLGROUP:
				return getColgroup();
			case XhtmlPackage.TABLE_TYPE__THEAD:
				return getThead();
			case XhtmlPackage.TABLE_TYPE__TFOOT:
				return getTfoot();
			case XhtmlPackage.TABLE_TYPE__TBODY:
				return getTbody();
			case XhtmlPackage.TABLE_TYPE__TR:
				return getTr();
			case XhtmlPackage.TABLE_TYPE__BORDER:
				return getBorder();
			case XhtmlPackage.TABLE_TYPE__CELLPADDING:
				return getCellpadding();
			case XhtmlPackage.TABLE_TYPE__CELLSPACING:
				return getCellspacing();
			case XhtmlPackage.TABLE_TYPE__CLASS:
				return getClass_();
			case XhtmlPackage.TABLE_TYPE__DIR:
				return getDir();
			case XhtmlPackage.TABLE_TYPE__FRAME:
				return getFrame();
			case XhtmlPackage.TABLE_TYPE__ID:
				return getId();
			case XhtmlPackage.TABLE_TYPE__LANG:
				return getLang();
			case XhtmlPackage.TABLE_TYPE__LANG1:
				return getLang1();
			case XhtmlPackage.TABLE_TYPE__RULES:
				return getRules();
			case XhtmlPackage.TABLE_TYPE__STYLE:
				return getStyle();
			case XhtmlPackage.TABLE_TYPE__SUMMARY:
				return getSummary();
			case XhtmlPackage.TABLE_TYPE__TITLE:
				return getTitle();
			case XhtmlPackage.TABLE_TYPE__WIDTH:
				return getWidth();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XhtmlPackage.TABLE_TYPE__CAPTION:
				setCaption((CaptionType)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__COL:
				getCol().clear();
				getCol().addAll((Collection<? extends ColType>)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__COLGROUP:
				getColgroup().clear();
				getColgroup().addAll((Collection<? extends ColgroupType>)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__THEAD:
				setThead((TheadType)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__TFOOT:
				setTfoot((TfootType)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__TBODY:
				getTbody().clear();
				getTbody().addAll((Collection<? extends TbodyType>)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__TR:
				getTr().clear();
				getTr().addAll((Collection<? extends TrType>)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__BORDER:
				setBorder((BigInteger)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__CELLPADDING:
				setCellpadding((String)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__CELLSPACING:
				setCellspacing((String)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__FRAME:
				setFrame((TFrame)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__ID:
				setId((String)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__LANG:
				setLang((String)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__LANG1:
				setLang1((String)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__RULES:
				setRules((TRules)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__SUMMARY:
				setSummary((String)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case XhtmlPackage.TABLE_TYPE__WIDTH:
				setWidth((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XhtmlPackage.TABLE_TYPE__CAPTION:
				setCaption((CaptionType)null);
				return;
			case XhtmlPackage.TABLE_TYPE__COL:
				getCol().clear();
				return;
			case XhtmlPackage.TABLE_TYPE__COLGROUP:
				getColgroup().clear();
				return;
			case XhtmlPackage.TABLE_TYPE__THEAD:
				setThead((TheadType)null);
				return;
			case XhtmlPackage.TABLE_TYPE__TFOOT:
				setTfoot((TfootType)null);
				return;
			case XhtmlPackage.TABLE_TYPE__TBODY:
				getTbody().clear();
				return;
			case XhtmlPackage.TABLE_TYPE__TR:
				getTr().clear();
				return;
			case XhtmlPackage.TABLE_TYPE__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case XhtmlPackage.TABLE_TYPE__CELLPADDING:
				setCellpadding(CELLPADDING_EDEFAULT);
				return;
			case XhtmlPackage.TABLE_TYPE__CELLSPACING:
				setCellspacing(CELLSPACING_EDEFAULT);
				return;
			case XhtmlPackage.TABLE_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case XhtmlPackage.TABLE_TYPE__DIR:
				unsetDir();
				return;
			case XhtmlPackage.TABLE_TYPE__FRAME:
				unsetFrame();
				return;
			case XhtmlPackage.TABLE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case XhtmlPackage.TABLE_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case XhtmlPackage.TABLE_TYPE__LANG1:
				setLang1(LANG1_EDEFAULT);
				return;
			case XhtmlPackage.TABLE_TYPE__RULES:
				unsetRules();
				return;
			case XhtmlPackage.TABLE_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case XhtmlPackage.TABLE_TYPE__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case XhtmlPackage.TABLE_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case XhtmlPackage.TABLE_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XhtmlPackage.TABLE_TYPE__CAPTION:
				return caption != null;
			case XhtmlPackage.TABLE_TYPE__COL:
				return col != null && !col.isEmpty();
			case XhtmlPackage.TABLE_TYPE__COLGROUP:
				return colgroup != null && !colgroup.isEmpty();
			case XhtmlPackage.TABLE_TYPE__THEAD:
				return thead != null;
			case XhtmlPackage.TABLE_TYPE__TFOOT:
				return tfoot != null;
			case XhtmlPackage.TABLE_TYPE__TBODY:
				return tbody != null && !tbody.isEmpty();
			case XhtmlPackage.TABLE_TYPE__TR:
				return tr != null && !tr.isEmpty();
			case XhtmlPackage.TABLE_TYPE__BORDER:
				return BORDER_EDEFAULT == null ? border != null : !BORDER_EDEFAULT.equals(border);
			case XhtmlPackage.TABLE_TYPE__CELLPADDING:
				return CELLPADDING_EDEFAULT == null ? cellpadding != null : !CELLPADDING_EDEFAULT.equals(cellpadding);
			case XhtmlPackage.TABLE_TYPE__CELLSPACING:
				return CELLSPACING_EDEFAULT == null ? cellspacing != null : !CELLSPACING_EDEFAULT.equals(cellspacing);
			case XhtmlPackage.TABLE_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case XhtmlPackage.TABLE_TYPE__DIR:
				return isSetDir();
			case XhtmlPackage.TABLE_TYPE__FRAME:
				return isSetFrame();
			case XhtmlPackage.TABLE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XhtmlPackage.TABLE_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case XhtmlPackage.TABLE_TYPE__LANG1:
				return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
			case XhtmlPackage.TABLE_TYPE__RULES:
				return isSetRules();
			case XhtmlPackage.TABLE_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case XhtmlPackage.TABLE_TYPE__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case XhtmlPackage.TABLE_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case XhtmlPackage.TABLE_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (border: ");
		result.append(border);
		result.append(", cellpadding: ");
		result.append(cellpadding);
		result.append(", cellspacing: ");
		result.append(cellspacing);
		result.append(", class: ");
		result.append(class_);
		result.append(", dir: ");
		if (dirESet) result.append(dir); else result.append("<unset>");
		result.append(", frame: ");
		if (frameESet) result.append(frame); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", lang1: ");
		result.append(lang1);
		result.append(", rules: ");
		if (rulesESet) result.append(rules); else result.append("<unset>");
		result.append(", style: ");
		result.append(style);
		result.append(", summary: ");
		result.append(summary);
		result.append(", title: ");
		result.append(title);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //TableTypeImpl
