package com.demo;

import com.demo.entity.Department;
import com.demo.entity.Persion;

public class TestDeepClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department(2019,"部门2019");

        Persion persion = new Persion(20,"张三", department);

        System.out.println("====================初始化persion值====================");
        System.out.println("初始化persion值的age地址:" + System.identityHashCode(persion.getAge()) + "，值：" + persion.getAge());
        System.out.println("初始化persion值的name地址:" + System.identityHashCode(persion.getName()) + "，值：" + persion.getName());
        System.out.println("初始化persion值的department地址:" + System.identityHashCode(persion.getDepartment()));
        System.out.println("初始化persion值的department地址deptNo:" + System.identityHashCode(persion.getDepartment().getDeptNo()) + "，值：" + persion.getDepartment().getDeptNo() );
        System.out.println("初始化persion值的department地址deptName:" + System.identityHashCode(persion.getDepartment().getDeptName()) + "，值：" + persion.getDepartment().getDeptName());
        System.out.println("====================初始化persion值====================\n");

        Persion persionCloneAfter = SerializedClone.clone(persion);

        System.out.println("====================拷贝后值====================");
        System.out.println("克隆后persion值的age地址:" + System.identityHashCode(persion.getAge()) + "，值：" + persion.getAge());
        System.out.println("克隆后persion值的name地址:" + System.identityHashCode(persion.getName()) + "，值：" + persion.getName());
        System.out.println("克隆后persion值的department地址:" + System.identityHashCode(persion.getDepartment()));
        System.out.println("克隆后persion值的department地址deptNo:" + System.identityHashCode(persion.getDepartment().getDeptNo()) + "，值：" + persion.getDepartment().getDeptNo() );
        System.out.println("克隆后persion值的department地址deptName:" + System.identityHashCode(persion.getDepartment().getDeptName()) + "，值：" + persion.getDepartment().getDeptName() + "\n");

        System.out.println("拷贝后persionCloneAfter值的age地址:" + System.identityHashCode(persionCloneAfter.getAge()) + "，值：" + persionCloneAfter.getAge());
        System.out.println("拷贝后persionCloneAfter值的name地址:" + System.identityHashCode(persionCloneAfter.getName()) + "，值：" + persionCloneAfter.getName());
        System.out.println("拷贝后persionCloneAfter值的department地址:" + System.identityHashCode(persionCloneAfter.getDepartment()));
        System.out.println("拷贝后persionCloneAfter值的department地址deptNo:" + System.identityHashCode(persionCloneAfter.getDepartment().getDeptNo()) + "，值：" + persionCloneAfter.getDepartment().getDeptNo() );
        System.out.println("拷贝后persionCloneAfter值的department地址deptName:" + System.identityHashCode(persionCloneAfter.getDepartment().getDeptName()) + "，值：" + persionCloneAfter.getDepartment().getDeptName());
        System.out.println("====================拷贝后值====================\n");

        //改变值
        Department departmentChanged = new Department(2020,"部门2020");
        Persion persionChanged = new Persion(50,"王五", departmentChanged);

        System.out.println("====================修改后值====================");
        System.out.println("修改后persion值的age地址:" + System.identityHashCode(persion.getAge()) + "，值：" + persion.getAge());
        System.out.println("修改后persion值的name地址:" + System.identityHashCode(persion.getName()) + "，值：" + persion.getName());
        System.out.println("修改后persion值的department地址:" + System.identityHashCode(persion.getDepartment()));
        System.out.println("修改后persion值的department地址deptNo:" + System.identityHashCode(persion.getDepartment().getDeptNo()) + "，值：" + persion.getDepartment().getDeptNo() );
        System.out.println("修改后persion值的department地址deptName:" + System.identityHashCode(persion.getDepartment().getDeptName()) + "，值：" + persion.getDepartment().getDeptName() + "\n");

        System.out.println("修改后persionChanged值的age地址:" + System.identityHashCode(persionChanged.getAge()) + "，值：" + persionChanged.getAge());
        System.out.println("修改后persionChanged值的name地址:" + System.identityHashCode(persionChanged.getName()) + "，值：" + persionChanged.getName());
        System.out.println("修改后persionChanged值的department地址:" + System.identityHashCode(persionChanged.getDepartment()));
        System.out.println("修改后persionChanged值的department地址deptNo:" + System.identityHashCode(persionChanged.getDepartment().getDeptNo()) + "，值：" + persionChanged.getDepartment().getDeptNo() );
        System.out.println("修改后persionChanged值的department地址deptName:" + System.identityHashCode(persionChanged.getDepartment().getDeptName()) + "，值：" + persionChanged.getDepartment().getDeptName());
        System.out.println("====================修改后值====================\n");


    }
}
