//
// Automatically @generated by Scrooge
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//
import Foundation
import TwitterApacheThrift
@objc(TESTFoundationThriftStruct)
@objcMembers
public class FoundationThriftStruct: NSObject, ThriftCodable {
    public var boolValue: Bool
    public var doubleValue: Double
    public var int16Value: Int16
    public var int32Value: Int32
    public var int64Value: Int64
    public var stringValue: String
    enum CodingKeys: Int, CodingKey {
        case boolValue = 1
        case doubleValue = 2
        case int16Value = 3
        case int32Value = 4
        case int64Value = 5
        case stringValue = 6
    }
    public init(boolValue: Bool, doubleValue: Double, int16Value: Int16, int32Value: Int32, int64Value: Int64, stringValue: String) {
        self.boolValue = boolValue
        self.doubleValue = doubleValue
        self.int16Value = int16Value
        self.int32Value = int32Value
        self.int64Value = int64Value
        self.stringValue = stringValue
        super.init()
    }
    public override var hash: Int {
        var hasher = Hasher()
        hasher.combine(self.boolValue)
        hasher.combine(self.doubleValue)
        hasher.combine(self.int16Value)
        hasher.combine(self.int32Value)
        hasher.combine(self.int64Value)
        hasher.combine(self.stringValue)
        return hasher.finalize()
    }
    public override func isEqual(_ object: Any?) -> Bool {
        guard let other = object as? Self else {
            return false
        }
        return self.boolValue == other.boolValue &&
        self.doubleValue == other.doubleValue &&
        self.int16Value == other.int16Value &&
        self.int32Value == other.int32Value &&
        self.int64Value == other.int64Value &&
        self.stringValue == other.stringValue
    }
}
