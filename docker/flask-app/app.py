from flask import Flask, jsonify
import os
import time

app = Flask(__name__)

@app.route('/')
def hello():
    return jsonify({
        'message': 'Hello from Flask Docker!',
        'environment': os.environ.get('FLASK_ENV', 'production'),
        'timestamp': time.time()
    })

@app.route('/health')
def health():
    return jsonify({'status': 'healthy'})

@app.route('/api/users')
def get_users():
    return jsonify({
        'users': [
            {'id': 1, 'name': 'John Doe'},
            {'id': 2, 'name': 'Jane Smith'}
        ]
    })

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000, debug=False)