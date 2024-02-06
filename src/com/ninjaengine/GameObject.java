package com.ninjaengine;

import java.util.ArrayList;
import java.util.List;

import com.dataStructure.Transform;

public class GameObject {
	private List<Component> components;
	private String name;
	public Transform transform;
	
	public GameObject(String name, Transform transform) {
		this.name = name;
		this.transform = transform;
		this.components = new ArrayList<>();
		
	}
	
	public <T extends Component> T getComponent(Class<T> componentClass) {
		for (Component c : components) {
			if (componentClass.isAssignableFrom(c.getClass())) {
				try {
					return componentClass.cast(c);
				} catch (ClassCastException e) {
					e.printStackTrace();
					System.exit(-1);
				}
			}
		}
		return null;
	}
	
	public void update(double dt) {
		System.out.println(this.name + " " + this.transform);
	}
}
