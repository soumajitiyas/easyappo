package com.easyapp.util;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * A Helper class for building map on single line of code, which improves readability.<br>
 * <p>
 * Unnecessary Generics can be skipped when using <code>create*</code> methods.
 * 
 * @author 
 * 
 * @param <K> Key
 * @param <V> Value
 */
public class MapBuilder<K, V> implements Serializable {
	private static final long serialVersionUID = 1L;

	private Map<K, V> map;

	/**
	 * Creates new map backed up by @{#link LinkedHashMap}
	 */
	public MapBuilder() {
		this(new LinkedHashMap<K, V>());
	}

	/**
	 * Creates builder backedup by given map. <br>
	 * <b>Note:</b> Mutable backedupBy map. To just copy map, use {@link #mapAll(Map)}
	 * 
	 * @param backedupBy
	 */
	public MapBuilder(Map<K, V> backedupBy) {
		this.map = backedupBy;
	}

	/**
	 * Same as {@link #MapBuilder()}, but avoids Generics by inferring type.
	 * <p>
	 * Creates new map backed up by @{#link LinkedHashMap}
	 * 
	 * @return
	 */
	public static <K, V> MapBuilder<K, V> create() {
		return new MapBuilder<K, V>();
	}

	/**
	 * Same as <code>new MapBuilder<K,V>().put(K,V)</code>, but client can avoid Generic syntax.
	 * <p>
	 * Creates new map backed up by @{#link LinkedHashMap}
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public static <K, V> MapBuilder<K, V> create(K key, V value) {
		return new MapBuilder<K, V>().map(key, value);
	}

	/**
	 * Puts multiple entries at once, e.g. map("key1","value1","key2","value2","key3","value3").
	 */
	public static <K, V> MapBuilder<K, V> create(Object... keyValues) {
		return new MapBuilder<K, V>().map(keyValues);
	}

	/**
	 * Same as {@link #MapBuilder(Map)}, but avoids Generics by defaulting to supplied Map's types.
	 * <p>
	 * Creates builder backedup by given map. <b>Note:</b> Mutable backedupBy map. To just copy map, use {@link #mapAll(Map)}
	 * 
	 * @param map
	 * @return
	 */
	public static <K, V> MapBuilder<K, V> create(Map<K, V> map) {
		return new MapBuilder<K, V>(map);
	}

	/**
	 * Convenience method for creating map of single key and value.
	 */
	public static <K, V> Map<K, V> buildMap(K key, V value) {
		return create(key, value).build();
	}

	/**
	 * Convenience method for creating map of multiple keyValues e.g.
	 * buildMap("key1","value1","key2","value2","key3","value3")
	 */
	@SuppressWarnings("unchecked")
	public static <K, V> Map<K, V> buildMap(Object... keyValues) {
		return (Map<K, V>) create(keyValues).build();
	}

	/**
	 * @return Map generated so far.
	 */
	public Map<K, V> build() {
		return map;
	}

	/**
	 * {@link #map(Object, Object)} + {@link #build()} in single shot.
	 */
	public Map<K, V> build(K key, V value) {
		return map(key, value).build();
	}

	/**
	 * Puts multiple entries at once, e.g. build("key1","value1","key2","value2","key3","value3") generates map.<br>
	 * {@link #map(Object...)} + {@link #build()} in single shot.
	 */
	public Map<K, V> build(Object... keyValues) {
		return map(keyValues).build();
	}

	/**
	 * Puts new Entry and returns same map.
	 */
	public MapBuilder<K, V> map(K key, V value) {
		map.put(key, value);
		return this;
	}

	/**
	 * Puts multiple entries at once, e.g. map("key1","value1","key2","value2","key3","value3") and returns same map.
	 */
	@SuppressWarnings("unchecked")
	public MapBuilder<K, V> map(Object... keyValues) {
		if (keyValues == null) return this;
		if (keyValues.length % 2 != 0) throw new IllegalArgumentException("even keyValues expected");
		for (int i = 0; i < keyValues.length;) {
			K key = (K) keyValues[i++];
			V value = (V) keyValues[i++];
			map.put(key, value);
		}
		return this;
	}

	/**
	 * Puts all entries from given map.
	 */
	public MapBuilder<K, V> mapAll(Map<K, V> srcMap) {
		map.putAll(srcMap);
		return this;
	}

	// /**
	// * Puts new Entry as Property and returns same map.
	// */
	// public MapBuilder<String, V> map(DProp<? extends V> prop) {
	// @SuppressWarnings("unchecked") MapBuilder<String, V> me = (MapBuilder<String, V>) this;
	// me.map.put(prop.getKey(), prop.get());
	// return me;
	// }
	//
	// /**
	// * Puts new Entry as Pair and returns same map.
	// */
	// public MapBuilder<K, V> map(Pair<? extends K, ? extends V> pair) {
	// map.put(pair.p, pair.q);
	// return this;
	// }

	/**
	 * Puts new Entry as Map.Entry and returns same map.
	 */
	public MapBuilder<K, V> map(Entry<? extends K, ? extends V> entry) {
		map.put(entry.getKey(), entry.getValue());
		return this;
	}
}