package org.payio.wallet.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import org.payio.wallet.model.data.Cryptocurrency;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CRYPTOCURRENCY".
*/
public class CryptocurrencyDao extends AbstractDao<Cryptocurrency, Long> {

    public static final String TABLENAME = "CRYPTOCURRENCY";

    /**
     * Properties of entity Cryptocurrency.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, long.class, "id", true, "_id");
        public final static Property Contract = new Property(1, String.class, "contract", false, "CONTRACT");
        public final static Property Logo = new Property(2, String.class, "logo", false, "LOGO");
        public final static Property Unit = new Property(3, String.class, "unit", false, "UNIT");
        public final static Property Name = new Property(4, String.class, "name", false, "NAME");
        public final static Property Balance = new Property(5, String.class, "balance", false, "BALANCE");
        public final static Property Proxy = new Property(6, String.class, "proxy", false, "PROXY");
        public final static Property Address = new Property(7, String.class, "address", false, "ADDRESS");
        public final static Property NeedAmount = new Property(8, String.class, "needAmount", false, "NEED_AMOUNT");
        public final static Property FreezeAmount = new Property(9, String.class, "freezeAmount", false, "FREEZE_AMOUNT");
    }


    public CryptocurrencyDao(DaoConfig config) {
        super(config);
    }
    
    public CryptocurrencyDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CRYPTOCURRENCY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 0: id
                "\"CONTRACT\" TEXT," + // 1: contract
                "\"LOGO\" TEXT," + // 2: logo
                "\"UNIT\" TEXT," + // 3: unit
                "\"NAME\" TEXT," + // 4: name
                "\"BALANCE\" TEXT," + // 5: balance
                "\"PROXY\" TEXT," + // 6: proxy
                "\"ADDRESS\" TEXT," + // 7: address
                "\"NEED_AMOUNT\" TEXT," + // 8: needAmount
                "\"FREEZE_AMOUNT\" TEXT);"); // 9: freezeAmount
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CRYPTOCURRENCY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Cryptocurrency entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String contract = entity.getContract();
        if (contract != null) {
            stmt.bindString(2, contract);
        }
 
        String logo = entity.getLogo();
        if (logo != null) {
            stmt.bindString(3, logo);
        }
 
        String unit = entity.getUnit();
        if (unit != null) {
            stmt.bindString(4, unit);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
 
        String balance = entity.getBalance();
        if (balance != null) {
            stmt.bindString(6, balance);
        }
 
        String proxy = entity.getProxy();
        if (proxy != null) {
            stmt.bindString(7, proxy);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(8, address);
        }
 
        String needAmount = entity.getNeedAmount();
        if (needAmount != null) {
            stmt.bindString(9, needAmount);
        }
 
        String freezeAmount = entity.getFreezeAmount();
        if (freezeAmount != null) {
            stmt.bindString(10, freezeAmount);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Cryptocurrency entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getId());
 
        String contract = entity.getContract();
        if (contract != null) {
            stmt.bindString(2, contract);
        }
 
        String logo = entity.getLogo();
        if (logo != null) {
            stmt.bindString(3, logo);
        }
 
        String unit = entity.getUnit();
        if (unit != null) {
            stmt.bindString(4, unit);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
 
        String balance = entity.getBalance();
        if (balance != null) {
            stmt.bindString(6, balance);
        }
 
        String proxy = entity.getProxy();
        if (proxy != null) {
            stmt.bindString(7, proxy);
        }
 
        String address = entity.getAddress();
        if (address != null) {
            stmt.bindString(8, address);
        }
 
        String needAmount = entity.getNeedAmount();
        if (needAmount != null) {
            stmt.bindString(9, needAmount);
        }
 
        String freezeAmount = entity.getFreezeAmount();
        if (freezeAmount != null) {
            stmt.bindString(10, freezeAmount);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public Cryptocurrency readEntity(Cursor cursor, int offset) {
        Cryptocurrency entity = new Cryptocurrency( //
            cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // contract
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // logo
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // unit
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // name
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // balance
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // proxy
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // address
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // needAmount
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9) // freezeAmount
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Cryptocurrency entity, int offset) {
        entity.setId(cursor.getLong(offset + 0));
        entity.setContract(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setLogo(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUnit(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBalance(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setProxy(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAddress(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setNeedAmount(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setFreezeAmount(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Cryptocurrency entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Cryptocurrency entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Cryptocurrency entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}