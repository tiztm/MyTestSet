package biz.nilstest;

import core.util.HTMLUtil;

/**
 * Created by IDEA
 * User:    tiztm
 * Date:    2018/4/4.
 */
public class DeptSQLCvt {

    static  String orSQL ="insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('4ae6e5cf4881d7660148865cd0650028', to_date('18-09-2014 09:25:02', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, null, null, 0, '038', '扬州市', null, null, 0, null, null, null, null, null, 12, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('4ae6e5cf4881d7660148865d2c410029', to_date('18-09-2014 09:25:26', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, null, null, 0, '039', '盐城市', null, null, 0, null, null, null, null, null, 13, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('4ae6e5cf4881d7660148865d6a92002a', to_date('18-09-2014 09:25:42', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, null, null, 0, '040', '淮安市', null, null, 0, null, null, null, null, null, 14, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('4ae6e5cf4881d7660148865dbc1d002b', to_date('18-09-2014 09:26:03', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, null, null, 0, '041', '连云港市', null, null, 0, null, null, null, null, null, 15, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('4ae6e5cf4881d7660148865df58c002c', to_date('18-09-2014 09:26:17', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, null, null, 0, '042', '宿迁市', null, null, 0, null, null, null, null, null, 16, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('4ae6e5cf4881d7660148865e3f66002d', to_date('18-09-2014 09:26:36', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, null, null, 0, '043', '徐州市', null, null, 0, null, null, null, null, null, 17, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('ff80808150d034170150ef37d2f236e8', null, null, null, null, null, 0, '004031', '北京分公司', null, null, 0, null, null, null, null, null, 0, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff65b50082', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004003', '办公室', null, null, 0, null, null, null, null, null, 3, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff65e40083', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004004', '财务部', null, null, 0, null, null, null, null, null, 4, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff66120084', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('21-04-2014 12:23:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004005', '市场部', null, null, 0, null, null, null, null, null, 5, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff669f0087', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('12-11-2013 10:59:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004008', '省内营销部', null, null, 0, null, null, null, null, null, 8, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff673b0089', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('21-04-2014 12:23:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004010', '系统集成事业部', null, null, 0, null, null, null, null, null, 10, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff677a008a', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('21-04-2014 12:24:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004011', '呼叫中心事业部', null, null, 0, null, null, null, null, null, 11, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff67b8008b', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('26-03-2018 11:02:38', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, 0, '004012', '视频应用事业部', null, null, 0, null, null, null, null, null, 12, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff6806008c', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('21-04-2014 12:48:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004013', '电信业务事业部', null, null, 0, null, null, null, null, null, 13, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff6864008e', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('09-04-2013 09:43:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004015', '交通行业信息化应用基地', null, null, 0, null, null, null, null, null, 15, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff6893008f', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('21-04-2014 12:25:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004016', '物联网应用事业部', null, null, 0, null, null, null, null, null, 16, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff68c20090', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('21-04-2014 12:25:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004017', '大数据应用事业部', null, null, 0, null, null, null, null, null, 17, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff69100092', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004019', '维护中心', null, null, 0, null, null, null, null, null, 19, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff65470080', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004001', '公司领导', null, null, 0, null, null, null, null, null, 1, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b40391d1b01404c0e7f33050e', to_date('05-08-2013 09:19:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('05-08-2013 09:19:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004028', '旅游基地', null, null, 0, null, null, null, null, null, 20, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3b84e926013b882a3f380654', to_date('11-12-2012 12:12:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('11-12-2012 12:12:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004027', '企业云信息运营中心', null, null, 0, null, null, null, null, null, 17, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('4ae6e5cf4881d7660148865aa2890021', to_date('18-09-2014 09:22:39', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', to_date('18-09-2014 09:23:01', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, 0, '031', '南京市', null, null, 0, null, null, null, null, null, 5, null, '0464060b3ace6070013ad4ff65e40083', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('ff80808159c3d5d4015a032da4c8106a', null, null, null, null, null, 0, '004032', '借调', null, null, 0, null, null, null, null, null, 0, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('ff80808159c3d5d4015a127a00111b32', null, null, null, null, null, 0, '004033', '营销部', null, null, 0, null, null, null, null, null, 0, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('ff80808159c3d5d4015a127bee631b3c', null, null, null, null, null, 0, '004033001', '营销部业务一部', null, null, 0, null, null, null, null, null, 0, null, 'ff80808159c3d5d4015a127a00111b32', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('ff80808159c3d5d4015a127d1d961b45', null, null, to_date('02-05-2017 16:20:03', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ad4fff2930187', null, 0, '004033003', '营销部业务三部', null, null, 0, null, null, null, null, null, 0, null, 'ff80808159c3d5d4015a127a00111b32', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('ff80808159c3d5d4015a16426caf1cfe', null, null, null, null, null, 0, '004031001', '北京办', null, null, 0, null, null, null, null, null, 0, null, 'ff80808150d034170150ef37d2f236e8', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('ff8080815a1ce75e015aa129c678391a', null, null, null, null, null, 0, '004034', '人力资源部', null, null, 0, null, null, null, null, null, 0, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('ff8080815a1ce75e015aa19d240b3ca3', null, null, null, null, null, 0, '004003001', '办公室(采购中心)', null, null, 0, null, null, null, null, null, 0, null, '0464060b3ace6070013ad4ff65b50082', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('ff80808159c3d5d4015a1743d26d1ed3', null, null, to_date('02-05-2017 16:20:20', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ad4fff2930187', null, 0, '004033005', '营销部业务二部', null, null, 0, null, null, null, null, null, 0, null, 'ff80808159c3d5d4015a127a00111b32', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('ff80808159c3d5d4015a179d0e9d217e', null, null, null, null, null, 0, '004005002', '政企支撑组', null, null, 0, null, null, null, null, null, 0, null, '0464060b3ace6070013ad4ff66120084', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ace659bc50008', to_date('05-11-2012 10:28:00', 'dd-mm-yyyy hh24:mi:ss'), '0464f19330ab03520130ab0ac2b00005', to_date('12-02-2015 10:53:34', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, 0, '004', '江苏鸿信系统集成有限公司', '01', null, 11, null, null, null, null, null, 1, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff66410085', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004006', '技术中心', null, null, 0, null, null, null, null, null, 6, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff66de0088', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 1, '004009', '解决方案中心', null, null, 0, null, null, null, null, null, 9, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff6835008d', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 1, '004014', '融合业务研发中心', null, null, 0, null, null, null, null, null, 14, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff68f10091', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 1, '004018', '合作部', null, null, 0, null, null, null, null, null, 18, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff694f0093', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 1, '004020', '位置信息服务运营中心', null, null, 0, null, null, null, null, null, 20, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff6a0a0097', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 1, '004024', '智慧农业组', null, null, 0, null, null, null, null, null, 24, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff6a390098', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 1, '004025', '后勤', null, null, 0, null, null, null, null, null, 25, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3af42531013af77212840b1e', to_date('13-11-2012 09:46:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('13-11-2012 09:46:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004026', '物联网应用和推广中心', null, null, 0, null, null, null, null, null, 17, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b41c53d2401424a3e68ee40a0', to_date('12-11-2013 10:57:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('26-03-2018 11:01:36', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, 0, '004029', '政务信息化应用事业部', null, null, 0, null, null, null, null, null, 12, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b3ace6070013ad4ff65760081', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('06-11-2012 17:13:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 0, '004002', '总经理助理', null, null, 0, null, null, null, null, null, 2, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('0464060b43567cbf01436f97da1f1489', to_date('08-01-2014 10:04:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', to_date('08-01-2014 14:20:00', 'dd-mm-yyyy hh24:mi:ss'), '0464060b3ace6070013ace6c8a6d001b', null, 1, '004030', '智慧社区项目研发运营团队', null, null, 0, null, null, null, null, null, 24, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('402881e8485d67da01485d755afa0004', to_date('10-09-2014 10:47:25', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, null, null, 1, '003', '省公司', '01', null, 0, null, '04', null, null, null, 2, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('402880e92db5d2ee012db601b2220004', null, null, to_date('11-09-2014 10:56:10', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, 0, '001', '系统管理', '01', null, 13, null, ' ', null, '1', null, 1, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('4ae6e5cf4881d7660148865b50f90022', to_date('18-09-2014 09:23:24', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, null, null, 0, '032', '苏州市', null, null, 0, null, null, null, null, null, 6, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('4ae6e5cf4881d7660148865b8d370023', to_date('18-09-2014 09:23:39', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, null, null, 0, '033', '无锡市', null, null, 0, null, null, null, null, null, 7, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('4ae6e5cf4881d7660148865bce470024', to_date('18-09-2014 09:23:56', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, null, null, 0, '034', '常州市', null, null, 0, null, null, null, null, null, 8, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('4ae6e5cf4881d7660148865c17e30025', to_date('18-09-2014 09:24:15', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, null, null, 0, '035', '镇江市', null, null, 0, null, null, null, null, null, 9, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('4ae6e5cf4881d7660148865c5cfa0026', to_date('18-09-2014 09:24:33', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, null, null, 0, '036', '南通市', null, null, 0, null, null, null, null, null, 10, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('4ae6e5cf4881d7660148865c96c70027', to_date('18-09-2014 09:24:47', 'dd-mm-yyyy hh24:mi:ss'), '402880e92db726b5012db729f65f0001', null, null, null, 0, '037', '泰州市', null, null, 0, null, null, null, null, null, 11, null, null, null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('ff80808160eaeb580160eb23fe000763', null, null, null, null, null, 0, '004036', '公司领导2', null, null, 0, null, null, null, null, null, 0, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n" +
            "\n" +
            "insert into department (ROW_ID, CREATETIME, CREATEUSERID, UPDATETIME, UPDATEUSERID, AREA_CODE, DEL_FLAG, DEPT_CODE, DEPT_NAME, DEPT_TYPE_CODE, EXPIRATION_DATE, HAS_CHILD, IS_PUBLIC, LINKED_DEPT_TYPE_CODE, NEED_APPROVAL, NEED_SUB_FLOW, OPEN_DATE, SORT_SQ, USER_LIMITED_NUMBER, PARENT_DEPT_ID, DELFLAG, DEPARTCODE, DEPARTNAME, DEPARTTYPE, DEPTID, ORDERCODE, PARENTID)\n" +
            "values ('ff8080815f4a753e015f4ecc795a0202', null, null, null, null, null, 0, '004035', '鸿信解决方案中心', null, null, 0, null, null, null, null, null, 0, null, '0464060b3ace6070013ace659bc50008', null, null, null, null, null, null, null);\n";
    public static void main(String[] args) {


        String[] deptStr = orSQL.split("insert into department");

        for (String s : deptStr) {
            String[] values = s.split("values");

            if(values==null||values.length!=2) continue;

            String colStr = values[0];
            String valueStr = values[1] ;




            String[] colSplitStr = colStr.split(",");


            String[] valSplitStr = valueStr.split(",");




            String colStrFinal = "";

            String valStrFinal = "";

            int j = 0;
            for (int i = 0; i < 20; i++) {


                if(i==1||i==3)
                {

                    if(valSplitStr[j].contains("to_date"))
                        j = j+2;
                    else
                        j = j+1;
                    continue;
                }



                colStrFinal = colStrFinal+","+colSplitStr[i];

                valStrFinal = valStrFinal+","+valSplitStr[j];


                j++;




            }


            colStrFinal = colStrFinal.substring(1);

            valStrFinal = valStrFinal.substring(1);

            String sql = "insert into department "+colStrFinal+") values  "+valStrFinal+" );";

            System.out.println(sql);

        }




    }
}
