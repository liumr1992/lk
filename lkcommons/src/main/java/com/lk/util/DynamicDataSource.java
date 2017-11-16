package com.lk.util;



import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;



import java.util.logging.Logger;

public class DynamicDataSource extends AbstractRoutingDataSource {
    protected Object determineCurrentLookupKey() {

        return  DynamicDataSourceHolder.getDataSource();
    }


}