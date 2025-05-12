package com.darkorbit

interface MapAddPOICommand : ProtocolPacket {
	var active: Boolean
	var design: POIDesignModule
	var inverted: Boolean
	var poiId: String
	var poiType: POITypeModule
	var poiTypeSpecification: String
	var shape: ShapeType
	var shapeCoordinates: MutableList<Int>
}
